package ex1;

import ex2.Cliente;

public abstract class Conta {

    private static Integer numeroConta = 1;
    private int idConta;
    private Cliente clienteTitular;
    private Double saldo;

    public Conta(Cliente clienteTitular, Double saldo) {
        this.idConta = numeroConta++;
        this.clienteTitular = clienteTitular;
        this.saldo = saldo;
    }

    public static Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {

        return saldo;
    }

    public Cliente getClienteTitular() {

        return clienteTitular;
    }

    @Override
    public String toString() {
        return
                " Conta: " + getClass().getSimpleName() + ", " +
                " Número Conta: " + idConta + ", " +
                " Cliente: " + clienteTitular + ", " +
                " Saldo: " + saldo +
                "\n"
                ;
    }
}
