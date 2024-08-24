package Exercicios_FIAP;

public class ContaREC {
    private int CPF;
    private String email;
    private String dataNascimento;
    private int codigoREC;
    private boolean reconhecimentoFacial;


    public void recuperaçãoDeConta(int CPF, String email, String dataNascimento, int codigoREC, boolean reconhecimentoFacial){
        this.CPF = CPF;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.codigoREC = codigoREC;
        this.reconhecimentoFacial = reconhecimentoFacial;
    }

    public int getCPF() {
        return CPF;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getCodigoREC() {
        return codigoREC;
    }

    public boolean isReconhecimentoFacial() {
        return reconhecimentoFacial;
    }

    public void setCPF(int CPF){
        this.CPF = CPF;
    }

    public void setEmail(String email){
        this.email =email;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    public void setReconhecimentoFacial(boolean reconhecimentoFacial) {
        this.reconhecimentoFacial = reconhecimentoFacial;
    }
}
