package s25692.gui.oop.LABO02.figures;

public class Square extends Rectangle {

    public Square(String color, int side) {
        super(color, side, side);
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }
}
