package HotelInHouse;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reserva reserva = new Reserva();
        reserva.setaQuartosCadastrados();//Add lista de quartos disponíveis para reserva

        //reserva.printQuartosCadastrados();

        int opt;
        do {
            reserva.menu();
            System.out.print("Escolha uma opção: ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    reserva.reserva();
                    break;
                case 2:
                    reserva.cancelarReserva();
                    break;
                case 0:
                    System.out.println("\nFinalizando Sistema!");
                    break;
                default:
                    System.out.println("\nOpção invalida!");
            }
        } while (opt != 0);

    }
}
