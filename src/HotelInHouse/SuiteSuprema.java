package HotelInHouse;

public class SuiteSuprema extends Quarto {

    private final Double baixaTemporada = 500.00;
    private final Double altaTemporada = 800.00;

    public SuiteSuprema(Integer numeroQuarto, Enums temporada) {

        super(numeroQuarto, temporada);
        super.setNomeQuarto("SUITE SUPREMA");
        super.setTipoDeQuarto(Enums.SUPREMA);
        if (temporada == Enums.BAIXA) {
            super.setValorDiaria(baixaTemporada);
        }
        if (temporada == Enums.ALTA) {
            super.setValorDiaria(altaTemporada);
        }
    }
}
