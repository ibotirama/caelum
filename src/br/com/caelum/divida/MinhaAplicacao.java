package br.com.caelum.divida;

public class MinhaAplicacao {

    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados("servidor", "usuario", "senha");
        BalancoEmpresa balanco = new BalancoEmpresa(bd);

        Divida div1 = new Divida();
        Divida div2 = new Divida();
        balanco.registraDivida(div1);
        balanco.registraDivida(div2);

        Cnpj credor = new Cnpj("00.000.000/0000-00");
        Pagamento pag1 = new Pagamento();
        Pagamento pag2 = new Pagamento();
        balanco.pagaDivida(credor, pag1);
        balanco.pagaDivida(credor, pag2);

        bd.desconectar();
    }

}
