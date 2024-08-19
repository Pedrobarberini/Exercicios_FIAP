package Exercicios_FIAP;

public class Usuario {
    
    private String email;
    private int CPF;
    private int telNumero;
    private String senha;
    private String nome;
    boolean login = false;


    public int getCPF(){
        return CPF;  
    }
    
    public String getsenha(){
        return senha;  
    }

    public String getnome(){
        return nome;  
    }

    public int getTelNumero(){
        return telNumero;
    }

    public String getEmail(){
        return email;
    }


    public void setCPF(int CPF){
        this.CPF = CPF;  
    }

    public void setSenha(String senha){
        this.senha = senha;  
    }

    public void setNome(String nome){
        this.nome = nome;  
    }

    public void setTelNumero(int telNumero){
        this.telNumero = telNumero;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}