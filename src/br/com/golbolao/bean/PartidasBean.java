package br.com.golbolao.bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.golbolao.dao.PartidasDAO;
import br.com.golbolao.domain.Partidas;

//Difinindo o nome do meu ManegedBean
@ManagedBean(name = "MBPartidas")
@ViewScoped
public class PartidasBean {

	// Variavel jogador que guarda os dados que eu vou salvar.
	private Partidas partidas;

	public Partidas getPartidas() {
		return partidas;
	}

	public void setPartidas(Partidas partidas) {
		this.partidas = partidas;
	}

	// Método para instanciar o objeto partidas
	public void prepararNovo() {
		partidas = new Partidas();
	}

	// Método salvar
	public void novo() {
		try {
			PartidasDAO dao = new PartidasDAO();
			dao.salvar(partidas);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
