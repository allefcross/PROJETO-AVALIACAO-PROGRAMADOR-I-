package br.com.golbolao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.golbolao.domain.Palpites;
import br.com.golbolao.factory.ConexaoFactory;

public class PalpitesDAO {
	// Método salvar
	public void salvar(Palpites p) throws SQLException {

		// Definindo a string SQL.
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO palpites ");
		sql.append("(valor1,valor2,partida_codigo,usuario_codigo)");
		sql.append("VALUES (?,?,?,?)");

		// Conectando com o banco de dados.
		Connection conexao = ConexaoFactory.conectar();

		// Convertendo o texto sql acima em um comando executavel.
		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		// Mapenado o obejto java.
		comando.setInt(1, p.getValor1());
		comando.setInt(2, p.getValor2());
		comando.setInt(3, p.getPartida_codigo());
		comando.setInt(4, p.getUsuario_codigo());

		// Executando o método salvar.
		comando.executeUpdate();
	}
}
