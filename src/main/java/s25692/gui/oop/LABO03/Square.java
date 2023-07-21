package s25692.gui.oop.LABO03;

public class Square implements Comparable<Square>, Figure {

    private static int counter;
    private final int length;
    private final int number;

    public Square(int length) throws TooBigSquareException {
        if (length > MAX)
            throw new TooBigSquareException("Maximum length is " + MAX);
        else
            this.length = length;
        this.number = counter++;
    }

    public int getArea() {
        return (int) Math.pow(length, 2);
    }

    @Override
    public String toString() {
        return "(" + number + "): " + getArea();
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }

    @Override
    public int compareTo(Square square) {
        return this.getArea() - square.getArea();
    }
}
