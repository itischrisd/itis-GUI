package s25692.gui.oop.LABO02.figures;

public class Main {

    public static void main(String[] args) {

        Figure[] figures = {
                new Square("black", 5),
                new Rectangle("blue", 5, 3),
                new Circle("red", 2),
                new Triangle("yellow", 3, 4)
        };

        for (Figure figure : figures)
            System.out.println(figure);
    }
}
