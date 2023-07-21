package s25692.gui.javafx.LABO13.ZAD1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Label resultLabel;

    @FXML
    private void handleLogin() {
        String login = loginField.getText();
        String password = passwordField.getText();

        if (login.equals("admin") && password.equals("admin")) {
            resultLabel.setText("Logowanie powiodło się!");
        } else {
            resultLabel.setText("Błędny login lub hasło!");
        }
    }
}
