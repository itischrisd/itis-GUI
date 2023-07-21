package s25692.gui.oop.LABO02.figures;

public class Circle extends Figure {

    int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
