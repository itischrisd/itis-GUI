package s25692.gui.swing.LABO06.zad2;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new TextFrame().setFont("SansSeriff", Font.BOLD | Font.ITALIC, 24, Color.RED, Color.WHITE)
        );
    }
}