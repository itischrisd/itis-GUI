package s25692.gui.swing.LABO09.zad1;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        TemperatureListModel temperatureListModel = new TemperatureListModel();
        JList<TemperatureInfo> temperatureList = new JList<>(temperatureListModel);
        temperatureList.setCellRenderer(new TemperatureRenderer());

        JScrollPane scrollPane = new JScrollPane(temperatureList);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
