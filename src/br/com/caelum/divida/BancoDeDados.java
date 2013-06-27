package br.com.caelum.divida;

import java.util.HashMap;

public class BancoDeDados implements ArmazenadorDeDividas{
    private final String local;
    private final String usuario;
    private final String senha;
    private HashMap<Documento, Divida> dividas = new HashMap<Documento, Divida>();

    public BancoDeDados(String local, String usuario, String senha){

        this.local = local;
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public void conectar(){
        System.out.println("Conectado ao banco de dados em "+local+", com usuário "+usuario);
    }

    @Override
    public void desconectar(){
        System.out.println("Desconectado do banco.");
    }

    @Override
    public void salva(Divida divida){
        dividas.put(divida.getDocumentoCredor(), divida);
    }

    @Override
    public Divida carregar(Documento documento){
        return dividas.get(documento);
    }

}
