package app.gui.registro;

import app.gui.AppController;
import app.gui.login.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RegistroFinalController extends AppController {


    @FXML
    private Button btnVolver;

    @FXML
    void irAInicio(ActionEvent event) {

    LoginController controllerLogin=(LoginController) cambiarVista(AppController.FXML_LOGIN);
    }

}
