package br.com.caelum.divida;

public interface ArmazenadorDeDividas {
    void conectar();

    void desconectar();

    void salva(Divida divida);

    Divida carregar(Documento documento);
}
