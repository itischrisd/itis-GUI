package s25692.gui.javafx.LABO13.ZAD2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    private final ObservableList<String> categories = FXCollections.observableArrayList("Wszystkie utwory", "Ulubione", "Albumy", "Wykonawcy", "Gatunki");
    @FXML
    private Label nowPlayingLabel;
    @FXML
    private ListView<String> categoriesListView;
    @FXML
    private TextField searchTextField;

    @FXML
    private void initialize() {
        categoriesListView.setItems(categories);
    }

    @FXML
    private void stop() {
        nowPlayingLabel.setText("Zatrzymano odtwarzanie");
    }

    @FXML
    private void shuffle() {
        nowPlayingLabel.setText("Przemieszczono utwory");
    }

    @FXML
    private void playInLoop() {
        nowPlayingLabel.setText("Odtwarzanie w pętli");
    }
}
