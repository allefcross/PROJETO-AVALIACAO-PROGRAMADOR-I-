package br.com.golbolao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.golbolao.domain.Partidas;
import br.com.golbolao.domain.Resultados;
import br.com.golbolao.factory.ConexaoFactory;

public class ResultadosDAO {

	// Método salvar
	public void salvar(Resultados r) throws SQLException {

		// Definindo a string SQL.
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO resultados ");
		sql.append("(valor1,valor2,partida_codigo)");
		sql.append("VALUES (?,?,?)");

		// Conectando com o banco de dados.
		Connection conexao = ConexaoFactory.conectar();

		// Convertendo o texto sql acima em um comando executavel.
		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		// Mapenado o obejto java.
		comando.setInt(1, r.getValor1());
		comando.setInt(2, r.getValor2());
		comando.setInt(3, r.getPartida_codigo());

		// Executando o método salvar.
		comando.executeUpdate();
	}

	public Partidas consultapornome(Partidas p) throws SQLException {

		// Definindo a string SQL.
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id_partida, serie, campeonato,time1,time2 ");
		sql.append("FROM partidas ");
		sql.append("WHERE capeonato LIKE ? ");

		// Conectando com o banco de dados.
		Connection conexao = ConexaoFactory.conectar();

		// Convertendo o texto sql acima em um comando executavel.
		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		// Mapenado o obejto java.
		comando.setString(1, "%" + p.getCampeonato() + "%");

		// Executando o método consulta.
		ResultSet resultado = comando.executeQuery();

		// Variavel que recebera os dados que vem do ResultSet.
		Partidas retorno = null;

		// Verificando se o ResultSet retornou algum dado.
		if (resultado.next()) {

			// Instanciado o objeto retorno.
			retorno = new Partidas();

			// Populando meu objeto com os dados do ResultSet.
			retorno.setId_partida(resultado.getInt("id_partida"));
			retorno.setSerie(resultado.getString("serie"));
			retorno.setCampeonato(resultado.getString("campeonato"));
			retorno.setTime1(resultado.getString("time1"));
			retorno.setTime2(resultado.getString("time2"));
		}
		// retornado o objeto.
		return retorno;
	}

}
