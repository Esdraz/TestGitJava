package _01_Fundamentos._99_exercicios;

import java.util.Scanner;

public class _Exercicio04Recursividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da tabuada que você deseja visualizar: ");
        int numero = sc.nextInt();

        System.out.println("--- Tabuada de: " + numero + " ---");
        imprimirTabuada(numero, 0);

        sc.close();
    }

    public static void imprimirTabuada(int numero, int multiplicador) {
        //caso base
        if (multiplicador > 10) {
            return;
        }

        //ação
        int resultado = numero * multiplicador;
        System.out.println(numero + " * " + multiplicador + " = " + resultado);
        //passo recursivo
        imprimirTabuada(numero, multiplicador + 1);

    }
}
