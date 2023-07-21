package s25692.gui.javafx.LABO11;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ZAD1 extends Application {
    private static final int ELLIPSE_RADIUS_X = 100;
    private static final int ELLIPSE_RADIUS_Y = 60;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Ellipse ellipse = new Ellipse(ELLIPSE_RADIUS_X, ELLIPSE_RADIUS_Y);
        ellipse.setFill(Color.BLUE);

        StackPane root = new StackPane(ellipse);
        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Ellipse Opacity Animation");
        primaryStage.setScene(scene);
        primaryStage.show();

        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), ellipse);
        fadeTransition.setFromValue(0.1);
        fadeTransition.setToValue(1.0);
        fadeTransition.setCycleCount(FadeTransition.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();
    }
}
