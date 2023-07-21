package s25692.gui.swing.LABO07.zad1;

import javax.swing.*;
import java.awt.*;

public class SumFrame extends JFrame {

    JTextField jTextFieldA = new JTextField("0");
    JTextField jTextFieldB = new JTextField("0");
    JLabel jLabelA = new JLabel("a:");
    JLabel jLabelB = new JLabel("b:");
    JButton jButton = new JButton("a+b");

    public SumFrame() {

        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        jTextFieldA.setPreferredSize(new Dimension(80, 20));
        jTextFieldB.setPreferredSize(new Dimension(80, 20));
        jButton.setSize(new Dimension(50, 20));

        jButton.addActionListener((e) -> jButton.setText(sum()));

        jPanel.add(jLabelA);
        jPanel.add(jTextFieldA);
        jPanel.add(jLabelB);
        jPanel.add(jTextFieldB);
        jPanel.add(jButton);

        add(jPanel);
        setTitle("Sumator");
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    private String sum() {
        try {
            return String.valueOf(Integer.parseInt(jTextFieldA.getText()) + Integer.parseInt(jTextFieldB.getText()));
        } catch (NumberFormatException e) {
            return "ERROR";
        }
    }
}
