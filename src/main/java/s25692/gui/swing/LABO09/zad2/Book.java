package s25692.gui.swing.LABO09.zad2;

import javax.swing.*;
import java.awt.*;

public class Book {
    private final String author;
    private final String title;
    private final ImageIcon cover;
    private double price;

    public Book(String author, String title, double price, String coverFileName) {
        this.author = author;
        this.title = title;
        this.price = price;
        cover = new ImageIcon(new ImageIcon("src/main/java/s25692/gui/swing/LABO09/zad2/covers/" + coverFileName).getImage().getScaledInstance(70, 80, Image.SCALE_SMOOTH));
    }

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
        cover = null;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ImageIcon getCover() {
        return cover;
    }

}
