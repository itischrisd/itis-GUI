package s25692.gui.javafx.LABO13.ZAD3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FlightSimulator.fxml")));
        primaryStage.setTitle("Sterowanie śmigłowcem");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }
}
