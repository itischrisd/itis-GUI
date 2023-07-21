package s25692.gui.javafx.LABO11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class ZAD7 extends Application {

    private static final String URL = "https://www.pja.edu.pl";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        WebView webView = new WebView();
        webView.getEngine().load(URL);

        Scene scene = new Scene(webView, 800, 600);

        primaryStage.setTitle("WebView App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
