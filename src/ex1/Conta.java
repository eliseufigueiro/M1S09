package ex1;

public abstract class Conta {

    private static Integer numeroConta = 0;
    private int idConta;
    private String nome;
    private Double saldo;

    public Conta(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.idConta = numeroConta++;
    }

    public static Integer getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return
                " Conta: " + getClass().getSimpleName() + ", " +
                " Número Conta: " + idConta + ", " +
                " Nome: " + nome + ", " +
                " Saldo: " + saldo +
                "\n"
                ;
    }
}
