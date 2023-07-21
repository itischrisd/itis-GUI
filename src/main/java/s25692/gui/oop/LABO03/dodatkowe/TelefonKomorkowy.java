package s25692.gui.oop.LABO03.dodatkowe;

public class TelefonKomorkowy extends Telefon implements Sendable {

    private final int simCardNumber;

    public TelefonKomorkowy(String producent, int cena, int simCardNumber) {
        super(producent, cena);
        this.simCardNumber = simCardNumber;
    }


    public String dial(int abonentNumber) throws NoSimCardException {
        if (simCardNumber == 0)
            throw new NoSimCardException("No sim card inserted into device.");
        return super.dial(abonentNumber);
    }
}
