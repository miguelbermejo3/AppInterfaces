package app.gui.bienvenida;

import app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class BienvenidaController extends AppController {

	@FXML
	private Label lblBienvenida;

	@FXML
	private BorderPane panel;

	@FXML
	void irAFavoritos(ActionEvent event) {
		panel.setCenter(cargarVista(AppController.FXML_FAVORITOS));
	}
	
	 @FXML
	    void irAEditar(ActionEvent event) {
		 panel.setCenter(cargarVista(AppController.FXML_EDITAR));
	    }

}


















