package br.com.holdingbenezinho.conta;

public class ContaPoupanca extends Conta{
    private int aniversario;


    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "aniversario=" + aniversario +
                '}';
    }

    public ContaPoupanca(int aniversario) {
        this.aniversario = aniversario;
    }

    public ContaPoupanca() {
    }


}