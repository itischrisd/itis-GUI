package s25692.gui.swing.LABO06.zad3;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        super("Test Zarządców Rozkładu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);

        JButton button1 = new JButton("Przycisk1");
        JButton button2 = new JButton("Przycisk 2");
        JButton button3 = new JButton("P3");
        JButton button4 = new JButton("P 4");
        JButton button5 = new JButton("Duży przycisk o numerze 5");

        button1.addActionListener(e -> JOptionPane.showMessageDialog(Main.this, "Kliknięto przycisk 1"));
        button2.addActionListener(e -> JOptionPane.showMessageDialog(Main.this, "Kliknięto przycisk 2"));
        button3.addActionListener(e -> JOptionPane.showMessageDialog(Main.this, "Kliknięto przycisk 3"));
        button4.addActionListener(e -> JOptionPane.showMessageDialog(Main.this, "Kliknięto przycisk 4"));
        button5.addActionListener(e -> JOptionPane.showMessageDialog(Main.this, "Kliknięto przycisk 5"));

        int wybor = Integer.parseInt(JOptionPane.showInputDialog("""
                Wybierz rozkład:
                1. BorderLayout
                2. FlowLayout - wyrównanie do lewej
                3. FlowLayout - wyrównanie do prawej
                4. FlowLayout
                5. GridLayout - jeden wiersz
                6. GridLayout - jedna kolumna
                7. GridLayout - tabela 2x3"""));

        switch (wybor) {
            case 1 -> {
                contentPane.setLayout(new BorderLayout());
                contentPane.add(button1, BorderLayout.NORTH);
                contentPane.add(button2, BorderLayout.WEST);
                contentPane.add(button3, BorderLayout.CENTER);
                contentPane.add(button4, BorderLayout.EAST);
                contentPane.add(button5, BorderLayout.SOUTH);
            }
            case 2 -> {
                contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
                contentPane.add(button1);
                contentPane.add(button2);
                contentPane.add(button3);
                contentPane.add(button4);
                contentPane.add(button5);
            }
            case 3 -> {
                contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
                contentPane.add(button1);
                contentPane.add(button2);
                contentPane.add(button3);
                contentPane.add(button4);
                contentPane.add(button5);
            }
            case 4 -> {
                contentPane.setLayout(new FlowLayout());
                contentPane.add(button1);
                contentPane.add(button2);
                contentPane.add(button3);
                contentPane.add(button4);
                contentPane.add(button5);
            }
            case 5 -> {
                contentPane.setLayout(new GridLayout(1, 0));
                contentPane.add(button1);
                contentPane.add(button2);
                contentPane.add(button3);
                contentPane.add(button4);
                contentPane.add(button5);
            }
            case 6 -> {
                contentPane.setLayout(new GridLayout(0, 1));
                contentPane.add(button1);
                contentPane.add(button2);
                contentPane.add(button3);
                contentPane.add(button4);
                contentPane.add(button5);
            }
            case 7 -> {
                contentPane.setLayout(new GridLayout(2, 3));
                contentPane.add(button1);
                contentPane.add(button2);
                contentPane.add(button3);
                contentPane.add(button4);
                contentPane.add(button5);
            }
            default -> JOptionPane.showMessageDialog(null, "Nieprawidłowy wybór");
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
