package s25692.gui.javafx.LABO11;

import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ZAD2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        Ellipse ellipse = new Ellipse(200, 200, 100, 50);
        ellipse.setFill(Color.BLUE);

        FillTransition fillTransition = new FillTransition(Duration.seconds(2), ellipse);
        fillTransition.setFromValue(Color.BLUE);
        fillTransition.setToValue(Color.RED);
        fillTransition.setAutoReverse(true);
        fillTransition.setCycleCount(FillTransition.INDEFINITE);
        fillTransition.play();

        root.getChildren().add(ellipse);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
