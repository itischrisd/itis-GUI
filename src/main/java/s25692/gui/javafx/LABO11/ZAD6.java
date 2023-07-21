package s25692.gui.javafx.LABO11;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ZAD6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        Rectangle square = new Rectangle(0, 0, 50, 50);
        square.setFill(Color.BLUE);

        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(2), square);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setAutoReverse(true);

        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(2), square);
        scaleTransition.setToX(2);
        scaleTransition.setToY(2);
        scaleTransition.setCycleCount(ScaleTransition.INDEFINITE);
        scaleTransition.setAutoReverse(true);

        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), square);
        translateTransition.setFromX(0);
        translateTransition.setFromY(0);
        translateTransition.setToX(scene.getWidth() - 75);
        translateTransition.setToY(scene.getHeight() - 75);
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransition.setAutoReverse(true);

        ParallelTransition parallelTransition = new ParallelTransition(square, rotateTransition, scaleTransition, translateTransition);
        parallelTransition.setCycleCount(ParallelTransition.INDEFINITE);
        parallelTransition.setAutoReverse(true);
        parallelTransition.play();

        root.getChildren().add(square);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
