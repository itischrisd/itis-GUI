package s25692.gui.swing.LABO09.zad1;

public class TemperatureInfo {
    private final int celsius;
    private final int fahrenheit;

    public TemperatureInfo(int celsius) {
        this.celsius = celsius;
        this.fahrenheit = celsiusToFahrenheit(celsius);
    }

    private int celsiusToFahrenheit(int celsius) {
        return (int) (celsius * 1.8 + 32);
    }

    public int getCelsius() {
        return celsius;
    }

    @Override
    public String toString() {
        return celsius + " stopni C = " + fahrenheit + " stopni F";
    }
}
