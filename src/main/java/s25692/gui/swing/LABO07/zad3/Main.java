package s25692.gui.swing.LABO07.zad3;

import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
    private final JTextField inputField;
    private int currentNumber;
    private int currentNumberSystem;
    private String currentOperator;
    private boolean newInput;

    public Main() {
        super("Kalkulator informatyczny");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        inputField = new JTextField(20);
        topPanel.add(inputField);
        add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        JButton[] numberButtons = new JButton[16];
        for (int i = 0; i < 16; i++) {
            String label = Integer.toString(i, 16).toUpperCase();
            numberButtons[i] = new JButton(label);
            centerPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(e -> handleDigit(label));
        }
        add(centerPanel, BorderLayout.CENTER);

        JPanel operatorPanel = new JPanel(new GridLayout(5, 1, 5, 5));
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton equalButton = new JButton("=");
        JButton clearButton = new JButton("CE");
        operatorPanel.add(addButton);
        operatorPanel.add(subtractButton);
        operatorPanel.add(multiplyButton);
        operatorPanel.add(divideButton);
        operatorPanel.add(equalButton);
        operatorPanel.add(clearButton);
        add(operatorPanel, BorderLayout.EAST);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JRadioButton decimalButton = new JRadioButton("Dec");
        JRadioButton binaryButton = new JRadioButton("Bin");
        JRadioButton octalButton = new JRadioButton("Oct");
        JRadioButton hexadecimalButton = new JRadioButton("Hex");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(decimalButton);
        buttonGroup.add(binaryButton);
        buttonGroup.add(hexadecimalButton);
        bottomPanel.add(decimalButton);
        bottomPanel.add(binaryButton);
        bottomPanel.add(octalButton);
        bottomPanel.add(hexadecimalButton);
        add(bottomPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> handleOperator("+"));
        subtractButton.addActionListener(e -> handleOperator("-"));
        multiplyButton.addActionListener(e -> handleOperator("*"));
        divideButton.addActionListener(e -> handleOperator("/"));
        equalButton.addActionListener(e -> calculateResult());
        clearButton.addActionListener(e -> clearMemory());

        decimalButton.addActionListener(e -> updateInputField(10));
        binaryButton.addActionListener(e -> updateInputField(2));
        octalButton.addActionListener(e -> updateInputField(8));
        hexadecimalButton.addActionListener(e -> updateInputField(16));

        currentNumberSystem = 10;
        newInput = true;
        decimalButton.setSelected(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    private void calculateResult() {
        try {
            String inputString = inputField.getText();
            int inputNumber = Integer.parseInt(inputString, currentNumberSystem);
            switch (currentOperator) {
                case "" -> currentNumber = inputNumber;
                case "+" -> currentNumber += inputNumber;
                case "-" -> currentNumber -= inputNumber;
                case "*" -> currentNumber *= inputNumber;
                case "/" -> currentNumber /= inputNumber;
            }
            inputField.setText(Integer.toString(currentNumber, currentNumberSystem));
            currentOperator = "";
            newInput = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nastąpił nieoczekiwany błąd.", "Błąd", JOptionPane.ERROR_MESSAGE);
            inputField.setText("");
        }
    }

    private void updateInputField(int numberSystem) {
        String currentText = inputField.getText();
        try {
            int currentValue = Integer.parseInt(currentText, currentNumberSystem);
            currentNumberSystem = numberSystem;
            inputField.setText(Integer.toString(currentValue, currentNumberSystem));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Nastąpił nieoczekiwany błąd.", "Błąd", JOptionPane.ERROR_MESSAGE);
            inputField.setText("");
        }
    }

    private void clearMemory() {
        inputField.setText("");
        currentNumber = 0;
        currentOperator = "";
    }

    private void handleOperator(String operator) {
        currentOperator = operator;
        String inputString = inputField.getText();
        currentNumber = Integer.parseInt(inputString, currentNumberSystem);
        newInput = true;
    }

    private void handleDigit(String digit) {
        if (newInput) {
            inputField.setText(digit);
            newInput = false;
        } else {
            inputField.setText(inputField.getText() + digit);
        }
    }
}