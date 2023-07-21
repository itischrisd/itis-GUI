package s25692.gui.swing.LABO09.zad2;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main extends JFrame {
    private final BookTableModel tableModel;
    private final JTable table;
    private final JTextField authorField;
    private final JTextField titleField;
    private final JTextField priceField;

    public Main() {
        super("Książki");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        tableModel = new BookTableModel();
        table = new JTable(tableModel);
        table.setRowHeight(80);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        authorField = new JTextField();
        titleField = new JTextField();
        priceField = new JTextField();

        inputPanel.add(new JLabel("Author:"));
        inputPanel.add(authorField);
        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(priceField);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(e -> {
            String author = authorField.getText();
            String title = titleField.getText();
            double price = Double.parseDouble(priceField.getText());
            Book book = new Book(author, title, price);
            tableModel.addBook(book);
            clearInputFields();
        });

        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(e -> {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                tableModel.removeBook(selectedRow);
            }
        });

        inputPanel.add(addButton);
        inputPanel.add(removeButton);
        add(inputPanel, BorderLayout.SOUTH);

        loadBooksFromFile();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }

    private void clearInputFields() {
        authorField.setText("");
        titleField.setText("");
        priceField.setText("");
    }

    private void loadBooksFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/s25692/gui/swing/LABO09/zad2/books.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String author = data[0];
                String title = data[1];
                double price = Double.parseDouble(data[2]);
                String coverFileName = data[3];

                Book book = new Book(author, title, price, coverFileName);
                tableModel.addBook(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
