package br.com.holdingbenezinho.pessoa;

public class PessoaJuridica extends Pessoa {
    private String CNPJ;
    private String razaoSocial;

    private Pessoa socios;


    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Pessoa getSocios() {
        return socios;
    }

    public void setSocios(Pessoa socios) {
        this.socios = socios;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "CNPJ='" + CNPJ + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                ", socios=" + socios +
                '}';
    }

    public PessoaJuridica(String nome, String CNPJ, String razaoSocial, Pessoa socios) {
        super(nome);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
        this.socios = socios;
    }

    public PessoaJuridica() {
    }

}