package br.com.golbolao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.golbolao.domain.Partidas;
import br.com.golbolao.factory.ConexaoFactory;

public class PartidasDAO {
	// Método salvar
	public void salvar(Partidas pt) throws SQLException {

		// Definindo a string SQL.
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO partidas ");
		sql.append("(serie,campeonato,time1,time2)");
		sql.append("VALUES (?,?,?,?)");

		// Conectando com o banco de dados.
		Connection conexao = ConexaoFactory.conectar();

		// Convertendo o texto sql acima em um comando executavel.
		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		// Mapenado o obejto java.
		comando.setString(1, pt.getSerie());
		comando.setString(2, pt.getCampeonato());
		comando.setString(3, pt.getTime1());
		comando.setString(4, pt.getTime2());

		// Executando o método salvar.
		comando.executeUpdate();
	}
}
