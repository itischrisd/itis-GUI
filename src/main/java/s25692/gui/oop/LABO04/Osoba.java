package s25692.gui.oop.LABO04;

public class Osoba {

    private final String imie;
    private final String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
