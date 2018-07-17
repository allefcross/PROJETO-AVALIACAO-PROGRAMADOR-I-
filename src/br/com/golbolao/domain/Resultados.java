package br.com.golbolao.domain;

public class Resultados {
	// Emplementação dos atributos da tabela Resultados
	private int id_resultado;
	private int valor1;
	private int valor2;
	private int partida_codigo;

	public int getId_resultado() {
		return id_resultado;
	}

	public void setId_resultado(int id_resultado) {
		this.id_resultado = id_resultado;
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

}
