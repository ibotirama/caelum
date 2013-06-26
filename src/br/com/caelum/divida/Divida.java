package br.com.caelum.divida;

public class Divida {
    private double total;
    private String credor;
    private Documento cnpjCredor;
    private Pagamentos pagamentos = new Pagamentos();
 
    public Documento getCnpjCredor() {
        return this.cnpjCredor;
    }
    public String getCredor() {
        return this.credor;
    }
    public double getTotal() {
        return this.total;
    }
    public void setCnpjCredor(Documento cnpjCredor) {
        this.cnpjCredor = cnpjCredor;
    }
    public void setCredor(String credor) {
        this.credor = credor;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double valorAPagar() {
        return this.total - this.pagamentos.getValorPago();
    }
    
	public void registra(Pagamento pagamento) {
		this.pagamentos.registra(pagamento);
	}
}