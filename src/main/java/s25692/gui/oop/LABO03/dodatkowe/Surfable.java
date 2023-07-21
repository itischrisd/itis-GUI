package s25692.gui.oop.LABO03.dodatkowe;

public interface Surfable {

    default String surf(String website) {
        return "curl https:\\\\" + website;
    }
}
