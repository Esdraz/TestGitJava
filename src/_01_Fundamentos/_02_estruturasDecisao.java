package _01_Fundamentos;

import java.util.Scanner;

public class _02_estruturasDecisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tipo de Usuário (ADMIN ou GUEST): ");
        var tipoUsuario = sc.nextLine(); //var infere o tipo para String nesse caso.

        //.toUpperCase converte a String toda para MAICUSCULO.
        String mensagem = switch (tipoUsuario.toUpperCase()) {
            case "ADMIN" -> "Acesso total permitido!";
            case "GUEST" -> "Acesso limitado!";
            default -> "Acesso Negado!";
        };

        System.out.println(mensagem);


/* Switch versão antiga -------
        switch (tipoUsuario.toUpperCase()) {
            case "ADMIN" :
                System.out.println("Acesso Total Permitido!");
                break;

            case "GUEST":
                System.out.println("Acesso Limitado!");
                break;

            default:
                System.out.println("Acesso Negado!");
        };*/

        sc.close();

        // ----------------
        int idade = 0;

        if (idade >= 18) {
            System.out.println("Maior de 18 anos!");
        } else {
            System.out.println("Menor de idade!");
        }
    }
}
