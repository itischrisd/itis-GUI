package s25692.gui.oop.LABO03;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Square[] squares = new Square[0];
        try {
            squares = new Square[]{
                    new Square(1),
                    new Square(5),
                    new Square(2),
                    new Square(4),
                    new Square(3),
            };
        } catch (TooBigSquareException e) {
            e.printStackTrace();
        }

        System.out.println("Przed sortowaniem:");
        for (Square square : squares)
            System.out.println(square);


        Arrays.sort(squares);

        System.out.println("Po sortowaniu:");
        for (Square square : squares)
            System.out.println(square);

    }
}
