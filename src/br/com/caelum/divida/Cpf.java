package br.com.caelum.divida;

public class Cpf implements Documento{
	private String valor;
	
	
	public String getValor() {
		return this.valor;
	}

	public boolean ehValido() {
		return false;
	}

}
