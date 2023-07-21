package s25692.gui.javafx.LABO11;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ZAD5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        Rectangle square = new Rectangle(150, 150, 100, 100);
        square.setFill(Color.BLUE);

        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), square);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setAutoReverse(true);;
        rotateTransition.play();

        root.getChildren().add(square);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
