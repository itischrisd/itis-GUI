package s25692.gui.oop.LABO04;

public class Samochod {

    private final String nrRejestracyjny;
    private final Marka marka;

    public Samochod(String nrRejestracyjny, Marka marka) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.marka = marka;
    }

    @Override
    public String toString() {
        return marka + " " + nrRejestracyjny;
    }

    enum Marka {
        SKODA, MAZDA, BMW, VOLVO;
    }
}
