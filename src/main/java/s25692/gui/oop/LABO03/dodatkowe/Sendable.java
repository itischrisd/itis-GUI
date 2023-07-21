package s25692.gui.oop.LABO03.dodatkowe;

public interface Sendable {

    default String send(String message, int recipientNumber) {
        return "Sending message to " + recipientNumber + "\n:" + message;
    }
}
