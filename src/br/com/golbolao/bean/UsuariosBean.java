package br.com.golbolao.bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.golbolao.dao.UsuariosDAO;
import br.com.golbolao.domain.Usuarios;

//Difinindo o nome do meu ManegedBean
@ManagedBean(name = "MBUsuarios")
@ViewScoped
public class UsuariosBean {

	// Variavel jogador que guarda os dados que eu vou salvar.
	private Usuarios usuarios;

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	// Método para instanciar o objeto usuarios
	public void prepararNovo() {
		usuarios = new Usuarios();
	}

	// Método salvar
	public void novo() {
		try {
			UsuariosDAO dao = new UsuariosDAO();
			dao.salvar(usuarios);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
