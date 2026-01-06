package _02_poo._03_encapsulamento;

public class UsarConta {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria("Francisco", 2000.00);

        minhaConta.depositar(500.00);
        System.out.println("Saldo Atual: " + minhaConta.getSaldo());
    }
}
