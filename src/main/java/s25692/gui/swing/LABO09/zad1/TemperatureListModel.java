package s25692.gui.swing.LABO09.zad1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TemperatureListModel extends AbstractListModel<TemperatureInfo> {
    private final List<TemperatureInfo> temperatures;

    public TemperatureListModel() {
        temperatures = new ArrayList<>();
        for (int celsius = -70; celsius <= 60; celsius++) {
            temperatures.add(new TemperatureInfo(celsius));
        }
    }

    @Override
    public int getSize() {
        return temperatures.size();
    }

    @Override
    public TemperatureInfo getElementAt(int index) {
        return temperatures.get(index);
    }

}
