package ex1;

import ex2.Cliente;

import java.time.LocalDate;
import java.util.Locale;

public class Main {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Agencia agencia = new Agencia();

        agencia.adicionar(new ContaCorrente(new Cliente("Bob", "78945612345", "Rua XBA"), 4300.00));
        agencia.adicionar(new ContaCorrente(new Cliente("Marco Veio", "78945612345", "Rua XBA"), 3200.00));
        agencia.adicionar(new ContaCorrente(new Cliente("Batman", "78945612345", "Rua XBA"), 15000.00));
        agencia.adicionar(new ContaPoupanca(new Cliente("Alfred", "78945612345", "Rua XBA"), 9000.00));
        agencia.adicionar(new ContaPoupanca(new Cliente("Miranha", "78945612345", "Rua XBA"), 2500.00));
        agencia.adicionar(new ContaPoupanca(new Cliente("Max", "78945612345", "Rua XBA"), 1500.00));

        System.out.println(agencia);
    }
}
