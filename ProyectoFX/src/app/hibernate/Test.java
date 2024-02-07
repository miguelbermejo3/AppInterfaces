package app.hibernate;

import app.gui.modelo.Usuario;
import app.gui.services.UsuarioService;

public class Test {

	public static void main(String[] args) {
		UsuarioService us= new UsuarioService();
		
		Usuario u= new Usuario();
		u.setNombreUsuario("miguel");
		u.setCorreo("miguelbermejo1@gmail.com");
		u.setNumTelefono(601254850);
		u.setPassword("betis");
		
		us.insertarUsuario(u);
		
		
		
	}

}
