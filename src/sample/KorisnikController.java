package sample;

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

 /*   public KorisnikController(KorisniciModel m){
        model = m;
    }


    @FXML
    public void initialize(){

        labelaIme.textProperty().bindBidirectional((Property<String>) model.getTrenutniKorisnik());

        //lista.setItems(model.getKorisnik());

    }

*/


}
