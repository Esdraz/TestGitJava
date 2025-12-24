package _01_Fundamentos;

import java.util.Scanner;

public class _01_FundamentosBase {
    public static void main(String[] args) {

        //entrada de dados
        Scanner sc = new Scanner(System.in);

        //variaveis
        String nome;
        int idade;
        double salario;
        boolean estaTrabalhando;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Está trabalhando? [s/n]: ");
        String opcao = sc.nextLine();

        //estrutura de controle IF/ELSE
        if (opcao.equals("s")) {
            estaTrabalhando = true;
        } else {
            estaTrabalhando = false;
        }

        System.out.print("Digite o seu salário: ");
        salario = sc.nextDouble();

        //Saida de dados
        System.out.println("Resumo:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Está trabalhando? " + estaTrabalhando);
        System.out.println("Salário Atual: " + salario);

        sc.close();
    }
}
