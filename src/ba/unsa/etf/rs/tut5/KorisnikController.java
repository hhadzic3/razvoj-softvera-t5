package ba.unsa.etf.rs.tut5;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
    public ListView lista;
    private KorisniciModel model;


    public void endProgram(ActionEvent actionEvent) {
        Node n = (Node) actionEvent.getSource();
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();
    }

    public void add(ActionEvent actionEvent) {
        ObservableList<String> ime =  FXCollections.observableArrayList(labelaIme.getText());
        ObservableList prezime =  FXCollections.observableArrayList(labelaPrezime.getText());
        lista.setItems(prezime);

    }

    public KorisnikController(KorisniciModel m) {
        model = m;
    }

    @FXML
    public void initialize(){

        model.setTrenutniKorisnik(model.getKorisnik().get(0));

        labelaIme.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
        labelaPrezime.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
        labelaMail.textProperty().bindBidirectional(model.getTrenutniKorisnik().mailProperty());
        labelaNik.textProperty().bindBidirectional(model.getTrenutniKorisnik().korisnickoImeProperty());
        labelaLozinka.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());

        lista.setItems(model.getKorisnik());


        lista.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Korisnik>() {
            @Override
            public void changed(ObservableValue<? extends Korisnik> observableValue, Korisnik korisnikOld, Korisnik korisnikNew) {
                if (korisnikOld != null) {
                    setTextPropetryUnBind();
                }
                if (korisnikNew == null) {
                    labelaIme.setText("");
                    labelaPrezime.setText("");
                    labelaMail.setText("");
                    labelaNik.setText("");
                    labelaLozinka.setText("");
                }
                else {
                    Korisnik korisnik = (Korisnik) lista.getSelectionModel().getSelectedItem();
                    setTextPropetryUnBind();
                    model.setTrenutniKorisnik(korisnik);
                    setTextPropetryBind();
                    lista.refresh();
                }
                lista.refresh();
            }

            public void setTextPropetryBind() {
                labelaIme.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
                labelaPrezime.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
                labelaMail.textProperty().bindBidirectional(model.getTrenutniKorisnik().mailProperty());
                labelaNik.textProperty().bindBidirectional(model.getTrenutniKorisnik().korisnickoImeProperty());
                labelaLozinka.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());
            }

            private void setTextPropetryUnBind() {
                labelaIme.textProperty().unbindBidirectional(model.getTrenutniKorisnik().imeProperty());
                labelaPrezime.textProperty().unbindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
                labelaMail.textProperty().unbindBidirectional(model.getTrenutniKorisnik().mailProperty());
                labelaNik.textProperty().unbindBidirectional(model.getTrenutniKorisnik().korisnickoImeProperty());
                labelaLozinka.textProperty().unbindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());
            }

        });



    }

}
