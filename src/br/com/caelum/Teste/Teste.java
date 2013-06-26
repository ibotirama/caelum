package br.com.caelum.Teste;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.modelo.*;

public class Teste {

	/**
	 * @param args
	 */
	
	static List<Pessoa> lista = null;
	
	public static void main(String[] args) {
		lista= new ArrayList<Pessoa>();
		PessoaFisica pf = new PessoaFisica();
		pf.setCodigo(1L);
		pf.setNome("Pedro");
		pf.setCpf("9879");
		
		lista.add(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setCodigo(2L);
		pj.setNome("Joao");
		pj.setCnpj("1111");
		
		lista.add(pj);
		
		for (Pessoa p : lista){
			System.out.println(p+", PF : "+(p instanceof PessoaFisica)+", PJ : "+(p instanceof PessoaJuridica));
		}
		

	}

}
