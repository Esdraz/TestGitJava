package _01_Fundamentos._99_exercicios;

import java.util.Scanner;

public class _Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PERCENTUAL_DESCONTO = 0.10; // 10%
        double subtotal = 0.0;
        double valorDesconto = 0.0;
        double valorTotal = 0.0;

        System.out.print("Informe o valor do produto: ");
        double valorProduto = sc.nextDouble();

        System.out.print("Informe a quantidade do produto: ");
        int quantidadeProduto = sc.nextInt();

        subtotal = valorProduto * quantidadeProduto;

        if (quantidadeProduto > 10) {
            valorDesconto = subtotal * PERCENTUAL_DESCONTO;
        }

        valorTotal = subtotal - valorDesconto;

        if (valorDesconto != 0.0) {
            System.out.println("Valor do desconto: R$" + valorDesconto);
        } else {
            System.out.println("Comprou menos de 10 unidades, não tem desconto!");
        }

        System.out.println("O valor total à pagar é de: R$" + valorTotal);

        sc.close();
    }
}
