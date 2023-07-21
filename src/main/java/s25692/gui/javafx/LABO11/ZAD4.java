package s25692.gui.javafx.LABO11;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ZAD4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400);

        Rectangle square = new Rectangle(0, 0, 50, 50);
        square.setFill(Color.BLUE);

        TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(2), square);
        translateTransition.setFromX(0);
        translateTransition.setFromY(0);
        translateTransition.setToX(scene.getWidth() - square.getWidth());
        translateTransition.setToY(scene.getHeight() - square.getHeight());
        translateTransition.setAutoReverse(true);
        translateTransition.setCycleCount(TranslateTransition.INDEFINITE);
        translateTransition.play();

        root.getChildren().add(square);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
