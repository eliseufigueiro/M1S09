package ex2;

import java.security.PrivateKey;

public class Cliente {

    private String nomeDoTitular;
    private String CPF;
    private String endereco;

    public Cliente(String nomeTitular, String CPF, String endereco) {
        this.nomeDoTitular = nomeTitular;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    @Override
    public String toString() {
        return
                " Nome: " + nomeDoTitular + ", " +
                " CPF: " + CPF + ", " +
                " Endereço: " + endereco
                ;
    }
}
