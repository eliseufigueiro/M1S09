package HotelInHouse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Reserva {

    private static List<Reserva> agendaDeReservas = new ArrayList<>();//DB para salvar as reservas por
    private static List<Quarto> listaQuartos = new ArrayList<>();
    private Hospede hospede;
    private Date dataInicial;
    private Date dataFinal;


    public void reserva() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, informe seu nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Por favor, informe o número do seu documento, CPF ou RG: ");
        String documento = sc.next();

        System.out.print("Por favor, informe sua data de nascimento (dd/mm/yyyy): ");
        String dtNascimento = sc.next();

        System.out.println("\nTipos de Quartos:\n" +
                "1." + Enums.SIMPLES + "\n" +
                "2." + Enums.LUXO + "\n" +
                "3." + Enums.SUPREMA);
        System.out.print("Por favor, informe o tipo de Quarto: ");
        int tipoDeQuarto = sc.nextInt();
        Enums quarto;
        switch (tipoDeQuarto) {
            case 1:
                quarto = Enums.SIMPLES;
                break;
            case 2:
                quarto = Enums.LUXO;
                break;
            case 3:
                quarto = Enums.SUPREMA;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + tipoDeQuarto);
        }

        System.out.println("\nQuartos disponíveis:");
        listaQuartosCadastrados(quarto);
        System.out.print("Por favor, informe o número de Quarto: ");
        int nDeQuarto = sc.nextInt();
    }

    public void cancelarReserva() {
        System.out.println("AQUI");
    }

    public void listaQuartosCadastrados(Enums enums) {

        for (int i = 0; i < listaQuartos.size(); i++) {
            if (listaQuartos.get(i).getTipoDeQuarto().equals(enums)){
                System.out.println(listaQuartos.get(i).getNomeQuarto() + ": " + listaQuartos.get(i).getNumeroQuarto() + " Valor da Diária R$ " + listaQuartos.get(i).getValorDiaria());
            }
        }
    }

    public void setaQuartosCadastrados() {

        Enums temporada = Enums.ALTA;

        listaQuartos.add(new QuartoSimples(101, temporada));
        listaQuartos.add(new QuartoSimples(102, temporada));
        listaQuartos.add(new QuartoSimples(103, temporada));
        listaQuartos.add(new QuartoSimples(104, temporada));
        listaQuartos.add(new QuartoSimples(105, temporada));
        listaQuartos.add(new QuartoSimples(106, temporada));
        listaQuartos.add(new QuartoSimples(107, temporada));
        listaQuartos.add(new QuartoLuxo(201, temporada));
        listaQuartos.add(new QuartoLuxo(202, temporada));
        listaQuartos.add(new QuartoLuxo(203, temporada));
        listaQuartos.add(new QuartoLuxo(204, temporada));
        listaQuartos.add(new SuiteSuprema(301, temporada));
        listaQuartos.add(new SuiteSuprema(302, temporada));
    }

    public void printQuartosCadastrados() {

        for (Quarto q : listaQuartos) {
            System.out.println(q.getNomeQuarto() + ": " + q.getNumeroQuarto());
        }
    }

    public void menu() {

        System.out.println("\nBEM VINDO AO HOTEL IN HOUSE\n");

        System.out.println("Menu opções:\n" +
                "1.Reservar\n" +
                "2.Cancelar Reserva\n" +
                "0.Sair\n");
    }
}
