package s25692.gui.oop.LABO02.figures;

public abstract class Figure {

    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " has color " + color + " and area of " + getArea();
    }
}
