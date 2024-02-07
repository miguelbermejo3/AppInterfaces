package app.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static Stage stage;
	public static final String FXML_LOGIN="/login/login.fxml";
	public static final String FXML_BIENVENIDA="/bienvenida/bienvenida.fxml";
	public static final String FXML_REGISTRO="/registro/registro.fxml";
	public static final String FXML_REGISTROFINAL="/registro/registroFinal.fxml";
	public static final String FXML_TIENDA="/bienvenida/tienda.fxml";
	public static final String FXML_FAVORITOS="/bienvenida/favoritos.fxml";
	public static final String FXML_EDITAR="/bienvenida/editar.fxml";
	
	
	
	
	public AppController() {

	}

	public AppController(Stage primaryStage) {
		stage=primaryStage  ;
	}
	

	public AppController cambiarVista(String fxml) {
		try {
			// 1. cargar el fxml
			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
			// creamos la escena
			Scene scene;
			scene = new Scene(loader.load());
			// cargar la escena en el escenario
			stage.setScene(scene);
			return loader.getController();
		} catch (IOException e) {
			System.err.println("No se ha podido cambiar de vista");
			System.err.println("Vista destino: " + fxml);
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public Parent cargarVista(String fxml) {
		try {
			URL url = App.class.getResource(fxml);
			FXMLLoader loader = new FXMLLoader(url);
			return loader.load();
		} catch (IOException e) {
			throw new RuntimeException("No se ha podido cargar fxml");
		}
	}

	public void initialize(URL url, ResourceBundle resource) {
		
		
	}

}
