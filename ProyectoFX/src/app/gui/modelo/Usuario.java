package app.gui.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name = "nombre")
	private String nombreUsuario;
	
	private String correo;
	private String password;
	@Column(name = "numero_telefono")
	private Integer numTelefono;
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(int i) {
		this.numTelefono = i;
	}
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", correo=" + correo + ", password=" + password
				+ ", numTelefono=" + numTelefono + "]";
	}
	
	
	
	
	

}
