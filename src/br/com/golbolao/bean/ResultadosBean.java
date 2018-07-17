package br.com.golbolao.bean;

import java.sql.SQLException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.golbolao.dao.ResultadosDAO;
import br.com.golbolao.domain.Resultados;

//Difinindo o nome do meu ManegedBean
@ManagedBean(name = "MBResultados")
@ViewScoped
public class ResultadosBean {

	// Variavel resultado que guarda os dados que eu vou salvar.
	private Resultados resultados;

	public Resultados getResultados() {
		return resultados;
	}

	public void setResultados(Resultados resultados) {
		this.resultados = resultados;
	}

	// Método para instanciar o objeto resultados
	public void prepararNovo() {
		resultados = new Resultados();
	}

	// Método salvar
	public void novo() {
		try {
			ResultadosDAO dao = new ResultadosDAO();
			dao.salvar(resultados);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

}
