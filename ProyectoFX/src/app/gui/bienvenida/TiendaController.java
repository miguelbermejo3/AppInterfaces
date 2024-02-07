package app.gui.bienvenida;



import app.gui.AppController;
import javafx.fxml.FXML;


import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class TiendaController extends AppController {

  
    
    private WebEngine engine;
    
    @FXML
    private WebView webView;
    
   
    public void initialize() {
    	engine=webView.getEngine();
		engine.load("https://www.realbetisbalompie.es/");
    }

    @FXML
	 void loadPage() {
    	
		
	}
    
    
    
    
}
