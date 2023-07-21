package s25692.gui.javafx.LABO13.ZAD2;

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
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MusicPlayer.fxml")));
        primaryStage.setTitle("Odtwarzacz muzyki");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
