package s25692.gui.swing.LABO07.zad2;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private final JTextField display;
    private double currentNumber;
    private String currentOperator;
    private boolean newInput;

    public Main() {
        super("Prosty Kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        add(display, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(4, 4, 10, 10));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(e -> onButtonClick(label));
            buttonsPanel.add(button);
        }

        add(buttonsPanel, BorderLayout.CENTER);

        currentNumber = 0;
        currentOperator = "";
        newInput = true;

        setVisible(true);
    }

    private void onButtonClick(String label) {
        if (label.matches("[0-9]")) {
            handleDigit(label);
        } else if (label.matches("[/*\\-+]")) {
            handleOperator(label);
        } else if (label.equals("=")) {
            calculateResult();
        } else if (label.equals(".")) {
            handleDecimalPoint();
        } else if (label.equals("C")) {
            handleClear();
        }
    }

    private void handleClear() {
        display.setText("");
        currentNumber = 0;
        currentOperator = "";
        newInput = true;
    }

    private void handleDigit(String digit) {
        if (newInput) {
            display.setText(digit);
            newInput = false;
        } else {
            display.setText(display.getText() + digit);
        }
    }

    private void handleOperator(String operator) {
        currentOperator = operator;
        currentNumber = Double.parseDouble(display.getText());
        newInput = true;
    }

    private void handleDecimalPoint() {
        if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }

    private void calculateResult() {
        try {
            double inputNumber = Double.parseDouble(display.getText());
            switch (currentOperator) {
                case "" -> currentNumber = inputNumber;
                case "+" -> currentNumber += inputNumber;
                case "-" -> currentNumber -= inputNumber;
                case "*" -> currentNumber *= inputNumber;
                case "/" -> currentNumber /= inputNumber;
            }
            display.setText(String.valueOf(currentNumber));
            newInput = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nastąpił nieoczekiwany błąd.", "Błąd", JOptionPane.ERROR_MESSAGE);
            display.setText("");
            newInput = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}