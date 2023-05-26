package br.com.holdingbenezinho.pessoa;

public abstract class Pessoa {

    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }
}
