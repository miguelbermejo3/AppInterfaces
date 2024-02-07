package app.gui.login;

import app.gui.AppController;
import app.gui.bienvenida.BienvenidaController;
import app.gui.registro.RegistroController;
import app.gui.services.UsuarioService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class LoginController extends AppController {

	@FXML
	private Label lblError;

	@FXML
	private Button btnInicio;

	@FXML
	private Button btnRegistro;

	@FXML
	private Label lblPregunta;

	@FXML
	private PasswordField password;

	@FXML
	private TextField txtUsuario;

	@FXML
	void iniciarSesion(ActionEvent event) {

		UsuarioService us = new UsuarioService();
		if (us.consultarUsuario(txtUsuario.getText()) != null) {
			lblError.setText("ACCESO AUTORIZADO");
			BienvenidaController controllerBienvenida = (BienvenidaController) cambiarVista(
					AppController.FXML_BIENVENIDA);
		} else {
			lblError.setText("Usuario no registrado.Por favor vuelva a intentarlo");
		}

	}

	@FXML
	void irARegistro(ActionEvent event) {
		RegistroController controllerRegistro = (RegistroController) cambiarVista(AppController.FXML_REGISTRO);
	}
	
	

}
