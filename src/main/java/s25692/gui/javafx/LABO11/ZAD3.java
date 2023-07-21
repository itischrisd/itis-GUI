package s25692.gui.javafx.LABO11;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ZAD3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        Rectangle square = new Rectangle(150, 150, 100, 100);
        square.setFill(Color.BLUE);

        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), square);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(ScaleTransition.INDEFINITE);
        scaleTransition.play();

        root.getChildren().add(square);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
