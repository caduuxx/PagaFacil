package dominio;

import java.util.Date;

public class Boleto {

    private double valor;
    private Date dataVencimento;
    private String codigoDeBarras;
    private String statusPagamento;
    private String quitar;

    private void PagarBoletos(){

    }
    private void SomarBoletos(){

    }
    public void AguendarPagamnetos(){

    }
    private void ConsultaDetalhes(){

    }
    // get e set
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getQuitar() {
        return quitar;
    }

    public void setQuitar(String quitar) {
        this.quitar = quitar;
    }


}
