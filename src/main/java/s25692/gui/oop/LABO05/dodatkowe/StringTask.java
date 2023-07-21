package s25692.gui.oop.LABO05.dodatkowe;


public class StringTask implements Runnable {

    private final String inputString;
    private final int repetitions;
    private String result;
    private TaskState state;

    public StringTask(String inputString, int repetitions) {
        this.inputString = inputString;
        this.repetitions = repetitions;
        this.state = TaskState.CREATED;
    }

    public String getResult() {
        return result;
    }

    public TaskState getState() {
        return state;
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void abort() {
        state = TaskState.ABORTED;
    }

    public boolean isDone() {
        return state == TaskState.READY || state == TaskState.ABORTED;
    }

    @Override
    public void run() {
        state = TaskState.RUNNING;
        result = "";

        for (int i = 0; i < repetitions; i++) {
            if (state == TaskState.ABORTED)
                return;
            result += inputString;
        }

        state = TaskState.READY;
    }

    enum TaskState {
        CREATED, RUNNING, ABORTED, READY;
    }
}
