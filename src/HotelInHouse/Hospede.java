package HotelInHouse;

import java.util.Date;

public class Hospede {

    private String docIdentificacao;
    private Date dtNascimento;
    private Enums tipoQuarto;

    public Hospede(String docIdentificacao, Date dtNascimento, Enums tipoQuarto) {
        this.docIdentificacao = docIdentificacao;
        this.dtNascimento = dtNascimento;
        this.tipoQuarto = tipoQuarto;
    }

    @Override
    public String toString() {
        return "Hospede{" +
                "docIdentificacao='" + docIdentificacao + '\'' +
                ", dtNascimento=" + dtNascimento +
                ", tipoQuarto=" + tipoQuarto +
                '}';
    }
}
