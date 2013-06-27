package br.com.caelum.divida;

public class Cpf implements Documento{
	private String valor;

    public Cpf(String valor){
        this.valor = valor;
    }
	
	public String getValor() {
		return this.valor;
	}

	public boolean ehValido() {
		return true;
	}

}
