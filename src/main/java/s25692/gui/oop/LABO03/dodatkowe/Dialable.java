package s25692.gui.oop.LABO03.dodatkowe;

public interface Dialable {

    default String dial(int abonentNumber) throws NoSimCardException {
        return "Dialing " + abonentNumber + "...";
    }
}
