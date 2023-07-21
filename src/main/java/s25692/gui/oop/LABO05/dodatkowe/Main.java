package s25692.gui.oop.LABO05.dodatkowe;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        StringTask task = new StringTask("A", 200000);
        System.out.println("Task " + task.getState());
        task.start();
//        args = new String[]{"abort"};
        if (args.length > 0 && args[0].equals("abort")) {
            Thread abortThread = new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                task.abort();
            });
            abortThread.start();
        }

        while (!task.isDone()) {
            Thread.sleep(500);
            switch (task.getState()) {
                case RUNNING -> System.out.print("R.");
                case ABORTED -> System.out.println(" ...  aborted.");
                case READY -> System.out.println(" ...  ready.");
                default -> System.out.println("uknown  state");
            }
        }

        System.out.println("Task " + task.getState());
        System.out.println(task.getResult().length());

    }
}
