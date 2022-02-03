package ex1;

import java.time.LocalDate;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Agencia agencia = new Agencia();

        agencia.adicionar(new ContaCorrente("Bob", 4300.00));
        agencia.adicionar(new ContaCorrente("Marco Veio", 3200.00));
        agencia.adicionar(new ContaCorrente("Batman", 15000.00));
        agencia.adicionar(new ContaPoupanca("Alfred", 9000.00));
        agencia.adicionar(new ContaPoupanca("Miranha", 2500.00));
        agencia.adicionar(new ContaPoupanca("Max", 1500.00));

        System.out.println(agencia.toString());
    }
}
