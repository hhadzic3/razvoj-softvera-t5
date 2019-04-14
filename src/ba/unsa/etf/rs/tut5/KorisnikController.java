package ba.unsa.etf.rs.tut5;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

    @FXML
    public void endProgram(ActionEvent actionEvent) {
        Node n = (Node) actionEvent.getSource();
        Stage stage = (Stage) n.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void add(ActionEvent actionEvent) {
        model.dodajKorisnika();
        setTextPropetryUnBind();
        model.setTrenutniKorisnik(model.getKorisnik().get(model.getKorisnik().size() - 1));
        setTextPropetryBind();
        lista.refresh();
        lista.requestFocus();
        lista.getSelectionModel().selectLast();
    }

    public KorisnikController(KorisniciModel m) {
        model = m;
    }

    @FXML
    public void initialize(){
        lista.requestFocus();
        model.setTrenutniKorisnik(model.getKorisnik().get(0));
        setTextPropetryBind();
        lista.setItems(model.getKorisnik());
        lista.getFocusModel().focus(0);
        setTextPropetryUnBind();

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
                    updateKorisnika();
                }
                lista.refresh();
            }

        });
    }

    private void updateKorisnika() {
        Korisnik korisnik = (Korisnik) lista.getSelectionModel().getSelectedItem();
        setTextPropetryUnBind();
        model.setTrenutniKorisnik(korisnik);
        setTextPropetryBind();
        lista.refresh();
    }

    private void setTextPropetryBind() {
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

}
