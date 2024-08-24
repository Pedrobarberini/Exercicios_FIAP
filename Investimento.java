package Exercicios_FIAP;

public class Investimento {
    private String idInvestimento;
    private double valor;
    private String dataInicio;
    private double taxaJuros;

    public Investimento(String idInvestimento, double valor, String dataInicio, double taxaJuros) {
        this.idInvestimento = idInvestimento;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.taxaJuros = taxaJuros;
    }

  
    public String getIdInvestimento() {
        return idInvestimento;
    }

    public void setIdInvestimento(String idInvestimento) {
        this.idInvestimento = idInvestimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}