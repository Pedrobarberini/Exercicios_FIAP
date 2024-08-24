package Exercicios_FIAP;

public class Divida {

    private String idDivida;
    private double valorPrincipal;
    private double taxaJuros;
    private int prazoMeses;

    public Divida(String idDivida, double valorPrincipal, double taxaJuros, int prazoMeses) {
        this.idDivida = idDivida;
        this.valorPrincipal = valorPrincipal;
        this.taxaJuros = taxaJuros;
        this.prazoMeses = prazoMeses;
    }

    // Getters e Setters
    public String getIdDivida() {
        return idDivida;
    }

    public void setIdDivida(String idDivida) {
        this.idDivida = idDivida;
    }

    public double getValorPrincipal() {
        return valorPrincipal;
    }

    public void setValorPrincipal(double valorPrincipal) {
        this.valorPrincipal = valorPrincipal;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }
}