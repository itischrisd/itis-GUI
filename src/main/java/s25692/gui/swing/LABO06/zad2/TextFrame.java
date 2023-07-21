package s25692.gui.swing.LABO06.zad2;

import javax.swing.*;
import java.awt.*;

public class TextFrame extends JFrame {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private final JTextArea jTextArea;

    public TextFrame() {
        this.jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);

        add(jScrollPane);

        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setFont(String name, int style, int size, Color bgColor, Color fgColor) {
        jTextArea.setFont(new Font(name, style, size));
        jTextArea.setForeground(fgColor);
        jTextArea.setBackground(bgColor);
    }
}
