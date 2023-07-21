package s25692.gui.oop.LABO05;

import java.util.ArrayList;
import java.util.List;

public class Letters {

    private final List<Thread> threads;

    public Letters(String letters) {

        threads = new ArrayList<>();

        for (char letter : letters.toCharArray()) {
            Thread thread = new Thread(() -> {
                while (!Thread.interrupted()) {
                    System.out.print(letter);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            });
            thread.setName("Thread " + letter);
            threads.add(thread);
        }
    }

    public List<Thread> getThreads() {
        return threads;
    }
}
