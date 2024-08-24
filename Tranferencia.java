package Exercicios_FIAP;

public class Tranferencia {

    private String nome;
    private int CPF;
    private String senha;
    private int numeroTelefone;

    
    public void tranferenciaPIX(int CPF, String nome, String senha, int numeroTelefone){
        this.CPF = CPF;
        this.nome = nome;
        this.senha = senha;
        this.numeroTelefone = numeroTelefone;
    }


    public String getNome() {
        return nome;
    }

    public int getCPF() {
        return CPF;
    }

    public String getSenha() {
        return senha;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }



}
