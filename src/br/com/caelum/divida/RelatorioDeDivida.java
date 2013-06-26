package br.com.caelum.divida;

import java.text.NumberFormat;

public class RelatorioDeDivida {
	private Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}

	public void geraRelatorio(NumberFormat formatador) {
		System.out.println("       Credor : "+divida.getCredor());
		System.out.println("  Cnpj credor :"+divida.getCnpjCredor());
		System.out.println("Valor a pagar :"+formatador.format(divida.valorAPagar()));
		System.out.println("Valor a total :"+formatador.format(divida.getTotal()));
	}
}
