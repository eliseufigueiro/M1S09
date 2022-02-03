package ex1;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private List<Conta> contas = new ArrayList<>();

    public void adicionar(Conta c) {

        this.contas.add(c);
    }

    public int getQuantidadeDeContas(){

        return this.contas.size();
    }

    @Override
    public String toString() {
        return
                "Contas: " + contas
                ;
    }
}
