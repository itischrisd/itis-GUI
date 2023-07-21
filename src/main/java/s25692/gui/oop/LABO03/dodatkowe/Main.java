package s25692.gui.oop.LABO03.dodatkowe;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Telefon[] telefony = {
                new Smartfon("Samsung", 4500),
                new TelefonKomorkowy("Alcatel", 700, 12345),
                new TelefonStacjonarny("Proel", 230)
        };

        for (Telefon telefon : telefony) {
            try {
                System.out.println(telefon.dial(606123505));
            } catch (NoSimCardException e) {
                e.printStackTrace();
            }
        }

        Playable[] giercoki = {
                new Konsola("Nintendo", 3000),
                new Smartfon("ASUS", 3500)
        };

        for (Playable playable : giercoki)
            System.out.println(playable.play());

        Urzadzenie[] urzadzenia = {
                new Smartfon("Samsung", 4500),
                new TelefonKomorkowy("Alcatel", 700, 12345),
                new TelefonStacjonarny("Proel", 230),
                new Smartfon("ASUS", 3500)
        };

        System.out.println("Przed sortowaniem:");
        for (Urzadzenie urzadzenie : urzadzenia)
            System.out.println(urzadzenie);

        Arrays.sort(urzadzenia, Comparator.comparingInt(Urzadzenie::getCena));

        System.out.println("Po sortowaniu:");
        for (Urzadzenie urzadzenie : urzadzenia)
            System.out.println(urzadzenie);
    }
}
