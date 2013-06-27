package br.com.caelum.divida;

public class BalancoEmpresa {
    private ArmazenadorDeDividas armazenadorDeDividas;

    public BalancoEmpresa(ArmazenadorDeDividas dividas) {
        this.armazenadorDeDividas = dividas;
    }

    public void registraDivida(Divida divida) {
        armazenadorDeDividas.salva(divida);
    }
 
    public void pagaDivida(Documento documentoCredor, Pagamento pagamento) {
        Divida divida = armazenadorDeDividas.carregar(documentoCredor);
        if (divida != null) {
            divida.registra(pagamento);
        }
        armazenadorDeDividas.salva(divida);
    }
}