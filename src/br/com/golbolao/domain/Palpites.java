package br.com.golbolao.domain;

public class Palpites {

	// Emplementação dos atributos da tabela Palpites
	private int id_palpite;
	private int valor1;
	private int valor2;
	private int partida_codigo;
	private int usuario_codigo;

	public int getId_palpite() {
		return id_palpite;
	}

	public void setId_palpite(int id_palpite) {
		this.id_palpite = id_palpite;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getPartida_codigo() {
		return partida_codigo;
	}

	public void setPartida_codigo(int partida_codigo) {
		this.partida_codigo = partida_codigo;
	}

	public int getUsuario_codigo() {
		return usuario_codigo;
	}

	public void setUsuario_codigo(int usuario_codigo) {
		this.usuario_codigo = usuario_codigo;
	}

}
