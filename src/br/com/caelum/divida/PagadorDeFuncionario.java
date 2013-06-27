package br.com.caelum.divida;

public class PagadorDeFuncionario {
    public void pagaFuncionario(Assalariado funcionario) {
        funcionario.depositaNaConta(funcionario.getSalario() + funcionario.getBonus());
    }

    public void pagaEstagiario(Bolsista estagiario) {
        estagiario.paga(estagiario.getBolsa() + estagiario.getAuxilios());
    }
}
