package s25692.gui.swing.LABO09.zad2;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class BookTableModel extends AbstractTableModel {
    List<Book> books;
    private final String[] columnNames = {"Author", "Title", "Price", "Cover"};

    public BookTableModel() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        fireTableRowsInserted(books.size() - 1, books.size() - 1);
    }

    public void removeBook(int rowIndex) {
        books.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    @Override
    public int getRowCount() {
        return books.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book book = books.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> book.getAuthor();
            case 1 -> book.getTitle();
            case 2 -> book.getPrice();
            case 3 -> book.getCover();
            default -> "N/D";
        };
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        if (columnIndex == 2) {
            try {
                double price = Double.parseDouble(value.toString());
                books.get(rowIndex).setPrice(price);
                fireTableCellUpdated(rowIndex, columnIndex);
            } catch (NumberFormatException e) {
                books.get(rowIndex).setPrice(0);
            }
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 2;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex){
            case 2 -> Double.class;
            case 3 -> ImageIcon.class;
            default -> String.class;
        };
    }
}
