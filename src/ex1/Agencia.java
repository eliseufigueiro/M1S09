package ex1;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private List<Conta> contas = new ArrayList<>();

    public void adicionar(Conta c) {

        this.contas.add(c);
    }

    public int getQuantidadeDeContas() {

        return this.contas.size();
    }

    public Conta buscarPorTitular(String nomeDoTitular) {

        Conta cTitular = null;
        for (Conta c : contas) {
            if (c.getClienteTitular().getNomeDoTitular().equals(nomeDoTitular)) {
                cTitular = c;
                System.out.println(cTitular);
            }
        }

        if (cTitular == null) {
            System.out.println("Não há registros bancários para esse nome!");
        }

        return cTitular;
    }

    @Override
    public String toString() {
        return
                "Contas: " + contas
                ;
    }
}
