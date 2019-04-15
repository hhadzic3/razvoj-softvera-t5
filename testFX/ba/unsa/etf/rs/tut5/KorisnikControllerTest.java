package ba.unsa.etf.rs.tut5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;


import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ApplicationExtension.class)
class KorisnikControllerTest {
    @Start
    public void start(Stage stage) throws Exception {
        KorisniciModel model = new KorisniciModel();
        model.napuni();
        FXMLLoader loader = new  FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(new KorisnikController(model));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();
        stage.toFront();
    }

    @Test
    void prviFXTest(FxRobot robot) {
        Button dodaj = robot.lookup("#add").queryAs(Button.class);
        assertNotNull(dodaj);
        robot.clickOn("Tarik Sijarcic");
        robot.clickOn("#kraj");
    }

    @Test
    void dodavanjeNovog(FxRobot robot){
        Button dodaj = robot.lookup("#add").queryAs(Button.class);
        robot.clickOn(dodaj);
        robot.clickOn("#labelaIme");
        robot.press(KeyCode.CONTROL).press(KeyCode.A).release(KeyCode.CONTROL).release(KeyCode.A);
        robot.write("Meho");
        robot.clickOn("#labelaPrezime");
        robot.write("Mehic");
        robot.clickOn("#labelaMail");
        robot.write("mehoMehic@gmal.com");
        robot.clickOn("#labelaNik");
        robot.write("Mehan");
        robot.clickOn("#labelaLozinka");
        robot.write("mehinjo");

        robot.clickOn("#add");

        assertEquals("Meho Mehic" , "Meho Mehic");

    }




}