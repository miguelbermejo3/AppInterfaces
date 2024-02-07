package app.gui.registro;

import app.gui.AppController;
import app.gui.modelo.Usuario;
import app.gui.services.UsuarioService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class RegistroController extends AppController{
	
	  @FXML
	    private Label lblError;

	 @FXML
	    private Button btnRegistro;

	    @FXML
	    private CheckBox chboxCondiciones;

	    @FXML
	    private TextField txtfieldCorreo;

	    @FXML
	    private TextField txtfieldNombre;

	    @FXML
	    private TextField txtfieldNumero;

	    @FXML
	    private PasswordField txtfieldPass;

	    @FXML
	    private PasswordField txtfieldPass2;

	    @FXML
	    void irAInicioSesion(ActionEvent event) {

	    	UsuarioService u= new UsuarioService();
	    	Usuario us= new Usuario();
	    	
	    	if(!txtfieldPass.getText().equals(txtfieldPass2.getText())) {
	    		lblError.setText("Las contraseñas deben de ser iguales");
	    		vaciarCampos();
	    		
	    	}
	    	if(txtfieldCorreo.getText().isEmpty()||txtfieldNombre.getText().isEmpty()||txtfieldPass.getText().isEmpty()||txtfieldPass2.getText().isEmpty()) {
	    		lblError.setText("No pude haber campos vacios");
	    		vaciarCampos();
	    		
	    	}
	    	if(txtfieldNumero.getText().contains(FXML_REGISTRO)) {
	    		
	    	}
	    	
	    	
	    	us.setCorreo(txtfieldCorreo.getText());
	    	us.setNombreUsuario(txtfieldNombre.getText());
	    	
	    	us.setNumTelefono(Integer.parseInt(txtfieldNumero.getText()));
	    	us.setPassword(txtfieldPass2.getText());
	    	
	    	u.insertarUsuario(us);
	    	
	    	System.out.println("Usuario introducido con éxito!!!!!");
	    	
	    	RegistroFinalController registroFinal= (RegistroFinalController) cambiarVista(AppController.FXML_REGISTROFINAL);
	    }
	    
	    public void vaciarCampos() {
	    	txtfieldCorreo.setText("");
	    	txtfieldNombre.setText("");
	    	txtfieldNumero.setText("");
	    	txtfieldPass.setText("");
	    	txtfieldPass.setText("");
	    }
	    
	    @FXML
		 void restriccionCaracteres(KeyEvent event) {
			if(event.getTarget().toString().equals(txtfieldNumero)) {
				if(!Character.isDigit(event.getCharacter().charAt(0))) {
					event.consume();
				}
				
			}
		}

}
