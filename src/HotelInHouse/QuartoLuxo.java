package HotelInHouse;

public class QuartoLuxo extends Quarto {

    private final Double baixaTemporada = 150.00;
    private final Double altaTemporada = 400.00;

    public QuartoLuxo(Integer numeroQuarto, Enums temporada) {

        super(numeroQuarto, temporada);
        super.setNomeQuarto("QUARTO LUXO");
        super.setTipoDeQuarto(Enums.LUXO);
        if (temporada == Enums.BAIXA) {
            super.setValorDiaria(baixaTemporada);
        }
        if (temporada == Enums.ALTA) {
            super.setValorDiaria(altaTemporada);
        }
    }
}
