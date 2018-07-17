package br.com.golbolao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.golbolao.domain.Usuarios;
import br.com.golbolao.factory.ConexaoFactory;

public class UsuariosDAO {

	// Método salvar
	public void salvar(Usuarios u) throws SQLException {

		// Definindo a string SQL.
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO usuarios ");
		sql.append("(nome,login,senha,nivel)");
		sql.append("VALUES (?,?,?,?)");

		// Conectando com o banco de dados.
		Connection conexao = ConexaoFactory.conectar();

		// Convertendo o texto sql acima em um comando executavel.
		PreparedStatement comando = conexao.prepareStatement(sql.toString());

		// Mapenado o obejto java.
		comando.setString(1, u.getNome());
		comando.setString(2, u.getLogin());
		comando.setString(3, u.getSenha());
		comando.setInt(4, u.getNivel());

		// Executando o método salvar.
		comando.executeUpdate();
	}

}
