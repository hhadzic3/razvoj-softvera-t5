package ba.unsa.etf.rs.tut5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ApplicationExtension.class)
    class MainTest {
    @Start
    public void start(Stage stage) throws Exception {
        Parent mainNode = FXMLLoader.load(Main.class.getResource("sample.fxml"));
        stage.setScene(new Scene(mainNode));
        stage.show();
        stage.toFront();
    }
    @Test
    public void testButtonClick (FxRobot robot) {
        /*Button prijavaBtn = robot.lookup("#prijavaBtn").queryAs(Button.class);
        robot.clickOn("#loginField");
        robot.write("anonymous");
        robot.clickOn("#prijavaBtn");
        assertEquals("anonymous", prijavaBtn.getText());*/

        // kucati svoj testni kod!!

        Button dodajBtn = robot.lookup("#add").queryAs(Button.class);
        robot.clickOn("#labelaIme");
        robot.write("Novi");
        robot.clickOn("#labelaPrezime");
        robot.write("Korisnik");
        robot.clickOn("#labelaMail");
        robot.write("Novi@gmail.com");
        robot.clickOn("#labelaNik");
        robot.write("Novicaa");
        robot.clickOn("#labelaLozinka");
        robot.write("jasam novi mali");
        assertEquals("anonymous", dodajBtn.getText());

    }


}
