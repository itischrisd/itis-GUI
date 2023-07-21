package s25692.gui.oop.LABO02.figures;

public class Triangle extends Figure {

    private final int side;
	private final int height;

    public Triangle(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (side * height) / 2;
    }
}
