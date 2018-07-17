package br.com.golbolao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	// Dados da conex�o com o banco.
	private static final String USUARIO = "postgres";
	private static final String SENHA = "syscon";
	private static final String URL = "jdbc:postgresql://localhost:5432/golbolao";

	// Implementa��o da conex�o com o banco.
	public static Connection conectar() throws SQLException {
		DriverManager.registerDriver(new org.postgresql.Driver());
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}

	// Teste da conex�o com o banco.
	public static void main(String[] args) {
		try {
			Connection conexao = ConexaoFactory.conectar();
			System.out.println("Conex�o realizada com sucesso!");
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("N�o foi possivel realizar a conex�o!");
		}
	}
}
