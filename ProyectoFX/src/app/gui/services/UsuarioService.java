package app.gui.services;

import org.hibernate.Session;

import app.gui.modelo.Usuario;
import app.hibernate.HibernateUtil;
import jakarta.persistence.PersistenceException;

public class UsuarioService {

	public void insertarUsuario(Usuario u) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactoy().openSession();
			session.getTransaction().begin();
			session.persist(u);
			session.getTransaction().commit();
		} catch (PersistenceException e) {
			session.getTransaction().rollback();
			throw e;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}
	
	
	public Usuario consultarUsuario(String nombreUsuario) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactoy().openSession();
			return session.get(Usuario.class, nombreUsuario);
		}
		catch(PersistenceException e) {
			throw e;
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
	}

}
