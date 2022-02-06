package ex4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            while (true) {
                try {
                    System.out.println("Eu sei dividir");

                    System.out.print("Informe o primeiro valor: ");
                    int x = sc.nextInt();

                    sc = new Scanner(System.in);

                    System.out.print("Informe o segundo valor: ");
                    int y = sc.nextInt();

                    double r = (double) x / y;
                    System.out.println("Resultado da divisão: " + r);

                    break;
                } catch (InputMismatchException | IllegalArgumentException e) {
                    System.err.println("Erro: " + e.getMessage() + "\nDigite um valor inteiro!");
                    System.out.println("\n");
                    sc = new Scanner(System.in);
                }
            }

        } finally {
            sc.close();
        }

    }
}
