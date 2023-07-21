@SuppressWarnings("JavaModuleNaming")
module s25692.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.web;


    opens s25692.gui.javafx.LABO13.ZAD1 to javafx.fxml;
    opens s25692.gui.javafx.LABO13.ZAD2 to javafx.fxml;
    opens s25692.gui.javafx.LABO13.ZAD3 to javafx.fxml;
    exports s25692.gui.javafx.LABO11;
    exports s25692.gui.javafx.LABO13.ZAD1;
    exports s25692.gui.javafx.LABO13.ZAD2;
    exports s25692.gui.javafx.LABO13.ZAD3;
}