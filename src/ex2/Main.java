package ex2;

import ex1.Agencia;
import ex1.ContaCorrente;
import ex1.ContaPoupanca;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Agencia agencia = new Agencia();

        agencia.adicionar(new ContaCorrente(new Cliente("Bob", "78945612345", "Rua XBA"), 4300.00));
        agencia.adicionar(new ContaCorrente(new Cliente("Marco Veio", "78945612345", "Rua XBA"), 3200.00));
        agencia.adicionar(new ContaCorrente(new Cliente("Batman", "78945612345", "Rua XBA"), 15000.00));
        agencia.adicionar(new ContaPoupanca(new Cliente("Alfred", "78945612345", "Rua XBA"), 9000.00));
        agencia.adicionar(new ContaPoupanca(new Cliente("Miranha", "78945612345", "Rua XBA"), 2500.00));
        agencia.adicionar(new ContaPoupanca(new Cliente("Max", "78945612345", "Rua XBA"), 1500.00));

        System.out.println(agencia);

        System.out.print("Digite o nome do Titular para buscar: ");
        agencia.buscarPorTitular(sc.nextLine());

    }
}
