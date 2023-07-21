package s25692.gui.oop.LABO02.figures;

public class Rectangle extends Figure {

    private final int side;
    private final int otherSide;

    public Rectangle(String color, int side, int otherSide) {
        super(color);
        this.side = side;
        this.otherSide = otherSide;
    }

    @Override
    public double getArea() {
        return otherSide * side;
    }

    protected int getSide() {
        return side;
    }
}
