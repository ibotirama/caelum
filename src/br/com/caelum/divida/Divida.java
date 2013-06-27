package br.com.caelum.divida;

public class Divida {
    private double total;
    private String credor;
    private Documento documentoCredor;
    private Pagamentos pagamentos = new Pagamentos();
 
    public Documento getDocumentoCredor() {
        return this.documentoCredor;
    }
    public String getCredor() {
        return this.credor;
    }
    public double getTotal() {
        return this.total;
    }
    public void setDocumentoCredor(Documento documentoCredor) {
        this.documentoCredor = documentoCredor;
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