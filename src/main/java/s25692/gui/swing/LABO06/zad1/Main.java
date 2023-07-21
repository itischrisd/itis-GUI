package s25692.gui.swing.LABO06.zad1;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame jFrame = new JFrame();

            JPanel jPanel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawLine(0, 0, getWidth() - 1, getHeight() - 1);
                    g.drawLine(0, getHeight() - 1, getWidth() - 1, 0);
                }
            };

            jFrame.add(jPanel);
            jFrame.setSize(640, 480);
            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        });

    }
}