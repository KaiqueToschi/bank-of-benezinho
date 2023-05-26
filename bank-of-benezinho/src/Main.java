import br.com.holdingbenezinho.agencia.Agencia;
import br.com.holdingbenezinho.banco.Banco;
import br.com.holdingbenezinho.conta.Conta;
import br.com.holdingbenezinho.conta.ContaCorrente;
import br.com.holdingbenezinho.pessoa.PessoaFisica;

import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void
    main(String[] args) {

        Agencia agenciamain = new Agencia();
        agenciamain.setContas(contaBenezinho);
        agenciamain.setNome("Nomes dos individos");
        agenciamain.setNumero("242424");

        PessoaFisica benezinho = new PessoaFisica();
        benezinho.setCPF("333.408/18");
        benezinho.setNome("Benefrancis");

        ContaCorrente contaBenezinho = new ContaCorrente();
        contaBenezinho.setAgencia(agenciamain);
        contaBenezinho.setSaldo(34533);
        contaBenezinho.setNumero("22221");
        contaBenezinho.setTitular(benezinho);
        contaBenezinho.setLimite(31231);

        Banco bancoBenezinho = new Banco();
        bancoBenezinho.setAgencias(agenciamain);
        bancoBenezinho.setNome("Banco Benezinho");

        System.out.println(contaBenezinho);

        System.out.println(benezinho);

        System.out.println(bancoBenezinho);

        System.out.println(agenciamain);




    }

    }







