package br.com.holdingbenezinho.conta;

import br.com.holdingbenezinho.agencia.Agencia;
import br.com.holdingbenezinho.pessoa.Pessoa;

public abstract class Conta {
    private String numero;
    private double saldo;

    private Agencia agencia;

    private Pessoa titular;


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                ", titular=" + titular +
                '}';
    }

    public Conta(String numero, double saldo, Agencia agencia, Pessoa titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.titular = titular;
    }

    public Conta() {
    }
}
