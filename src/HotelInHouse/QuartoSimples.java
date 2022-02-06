package HotelInHouse;

public class QuartoSimples extends Quarto {

    private final Double baixaTemporada = 90.00;
    private final Double altaTemporada = 140.00;

    public QuartoSimples(Integer numeroQuarto, Enums temporada) {

        super(numeroQuarto, temporada);
        super.setNomeQuarto("QUARTO SIMPLES");
        super.setTipoDeQuarto(Enums.SIMPLES);
        if (temporada == Enums.BAIXA) {
            super.setValorDiaria(baixaTemporada);
        }
        if (temporada == Enums.ALTA) {
            super.setValorDiaria(altaTemporada);
        }
    }
}
