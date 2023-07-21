package s25692.gui.swing.LABO09.zad1;

import javax.swing.*;
import java.awt.*;

public class TemperatureRenderer extends DefaultListCellRenderer {
    private static final Color BLUE_COLOR = new Color(66, 135, 245);
    private static final Color RED_COLOR = new Color(235, 76, 52);

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        TemperatureInfo temperatureInfo = (TemperatureInfo) value;

        if (temperatureInfo.getCelsius() < 6) {
            component.setBackground(BLUE_COLOR);
        } else if (temperatureInfo.getCelsius() > 25) {
            component.setBackground(RED_COLOR);
        } else {
            component.setBackground(list.getBackground());
        }

        return component;
    }
}
