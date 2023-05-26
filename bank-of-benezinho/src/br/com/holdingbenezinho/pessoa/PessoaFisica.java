package br.com.holdingbenezinho.pessoa;

public class PessoaFisica extends Pessoa{
    private String CPF;

    private PessoaFisica mae;


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public PessoaFisica getMae() {
        return mae;
    }

    public void setMae(PessoaFisica mae) {
        this.mae = mae;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "CPF='" + CPF + '\'' +
                ", mae=" + mae +
                '}';
    }

    public PessoaFisica(String CPF, PessoaFisica mae) {
        this.CPF = CPF;
        this.mae = mae;
    }

    public PessoaFisica() {
    }
}
