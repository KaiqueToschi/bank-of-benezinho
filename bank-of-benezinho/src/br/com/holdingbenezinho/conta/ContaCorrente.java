package br.com.holdingbenezinho.conta;

public class ContaCorrente extends Conta {
    private double limite;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                '}';
    }

    public ContaCorrente(double limite) {
        this.limite = limite;
    }

    public ContaCorrente() {
    }


}