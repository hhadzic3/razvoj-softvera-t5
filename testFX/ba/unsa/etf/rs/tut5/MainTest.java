package ba.unsa.etf.rs.tut5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

@ExtendWith(ApplicationExtension.class)
    class MainTest {
    @Start
    public void start(Stage stage) throws Exception {
        Parent mainNode = FXMLLoader.load(Main.class.getResource("prijava.fxml"));
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


    }


}
