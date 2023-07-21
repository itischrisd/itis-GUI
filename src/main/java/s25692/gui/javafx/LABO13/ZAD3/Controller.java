package s25692.gui.javafx.LABO13.ZAD3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.Objects;

public class Controller {
    @FXML
    private Label heightLabel;

    @FXML
    private Label fuelLabel;

    @FXML
    private Slider speedSlider;

    @FXML
    private ImageView helicopterImageView;

    public void initialize() throws IOException {
        updateHeightLabel(0);
        updateFuelLabel(100);

        Image helicopterImage = new Image(Objects.requireNonNull(getClass().getResource("img.png")).openStream());
        helicopterImageView.setImage(helicopterImage);
        helicopterImageView.setFitWidth(800);
        helicopterImageView.setFitHeight(500);
    }

    public void updateHeightLabel(double height) {
        heightLabel.setText(height + " m");
    }

    public void updateFuelLabel(double fuelPercentage) {
        fuelLabel.setText(fuelPercentage + "%");
    }
}
