package app.gui.bienvenida;

import app.gui.AppController;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FavoritosController extends AppController{


    @FXML
    private TextField buscadorTexto;


    @FXML
    private TableView<?> tablaEnlaces;
	
	
    @FXML
    private ComboBox<String> cbboxCategorias;
	  
	  public void initialize() {
		  cbboxCategorias.getItems().add("Deportes");
		  cbboxCategorias.getItems().add("Educación");
		  
	  }
	 
	
	
	
	
	
	
}
