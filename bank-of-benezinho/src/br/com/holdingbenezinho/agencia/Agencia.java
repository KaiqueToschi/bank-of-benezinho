package br.com.holdingbenezinho.agencia;

import br.com.holdingbenezinho.banco.Banco;
import br.com.holdingbenezinho.conta.Conta;

public class Agencia {
    private String numero;
    private String nome;

    private Banco banco;

    private Conta contas;


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco getBanco() {
        return banco;
    }


    public Conta getContas() {
        return contas;
    }

    public void setContas(Conta contas) {
        this.contas = contas;
    }

    public Agencia(String numero, String nome, Banco banco, Conta contas) {
        this.numero = numero;
        this.nome = nome;
        this.banco = banco;
        this.contas = contas;
    }

    public Agencia() {
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "numero='" + numero + '\'' +
                ", nome='" + nome + '\'' +
                ", banco=" + banco +
                ", contas=" + contas +
                '}';
    }

}