package br.com.golbolao.bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.golbolao.dao.PalpitesDAO;
import br.com.golbolao.domain.Palpites;

//Difinindo o nome do meu ManegedBean
@ManagedBean(name = "MBpalpites")
@ViewScoped
public class PalpitesBean {

	// Variavel jogador que guarda os dados que eu vou salvar.
	private Palpites palpites;

	public Palpites getPalpites() {
		return palpites;
	}

	public void setPalpites(Palpites palpites) {
		this.palpites = palpites;
	}

	// Método para instanciar o objeto palpites
	public void prepararNovo() {
		palpites = new Palpites();
	}

	// Método salvar
	public void novo() {
		try {
			PalpitesDAO dao = new PalpitesDAO();
			dao.salvar(palpites);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
