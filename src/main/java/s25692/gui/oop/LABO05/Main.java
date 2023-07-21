package s25692.gui.oop.LABO05;

public class Main {

	public static void main(String[] args) {

		Letters  letters = new Letters("ABCD");

		for (Thread t : letters.getThreads ())
			System.out.println(t.getName());

		for (Thread thread : letters.getThreads())
			thread.start();

		try {
			Thread.sleep (5000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		for (Thread thread : letters.getThreads())
			thread.interrupt();

		System.out.println("\nProgram  skończył działanie");
	}
}
