package ba.unsa.etf.rs.tut5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class KorisnikController {

    public TextField labelaIme;
    public TextField labelaPrezime;
    public TextField labelaMail;
    public TextField labelaNik;
    public PasswordField labelaLozinka;
    public ListView<Korisnik> lista;
    private KorisniciModel model;


    public void endProgram(ActionEvent actionEvent) {
        Node n = (Node) actionEvent.getSource();
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();
    }

    /*public void add(ActionEvent actionEvent) {
        ObservableList ime = new FXCollections.observableArrayList(labelaIme.getText());
        ObservableList prezime = new FXCollections(ObservableList(labelaPrezime.getText()));
        lista.setItems(ime + " " + prezime);
    }*/

    /*public KorisnikController(KorisniciModel m) {
        model = m;
    }

    @FXML
    public void initialize(){

        labelaIme.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
        labelaPrezime.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
        labelaMail.textProperty().bindBidirectional(model.getTrenutniKorisnik().mailProperty());
        labelaNik.textProperty().bindBidirectional(model.getTrenutniKorisnik().korisnickoImeProperty());
        labelaLozinka.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());

        lista.setItems(model.getKorisnik());

    }*/




}
