package HotelInHouse;

public abstract class Quarto {

    private Integer numeroQuarto;
    private String nomeQuarto;
    private Enums tipoDeQuarto;
    private Double valorDiaria;
    private Enums temporada;

    public Quarto(Integer numeroQuarto, Enums temporada) {
        this.numeroQuarto = numeroQuarto;
        this.temporada = temporada;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public String getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(String nomeQuarto) {

        this.nomeQuarto = nomeQuarto;
    }

    public Enums getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public void setTipoDeQuarto(Enums tipoDeQuarto) {
        this.tipoDeQuarto = tipoDeQuarto;
    }

    public Double getValorDiaria() {

        return valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {

        this.valorDiaria = valorDiaria;
    }
}
