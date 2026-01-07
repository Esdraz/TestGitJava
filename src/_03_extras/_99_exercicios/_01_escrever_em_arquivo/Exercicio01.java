package _03_extras._99_exercicios._01_escrever_em_arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws IOException {
        /*
         * Crie um programa que vai receber, através do console, uma lista de atividades que
         * vai ajudar o usuário a planejar suas tarefas para o dia seguinte.
         * Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão salvas em um
         * arquivo de texto - cada tarefa vai ocupar uma linha desse arquivo. Para receber cada
         * tarefa do usuário, use o laço while. Enquanto o usuário não digitar um "x" no console,
         * continue pedindo que ele informe as atividades.
         * */

        Scanner sc = new Scanner(System.in);
        ArrayList<String> atividades = new ArrayList<String>();

        //outra forma de fazer o laço...
        String tarefa = "";
        while (true) {

            System.out.print("Digite uma tarefa: ");
            tarefa = sc.nextLine();
            if (tarefa.equals("x")) {
                break;
            } else {
                atividades.add(tarefa);
            }
        }

        //outra forma de fazer o laço...
/*
        String opcao = "";
        do {
            System.out.print("Digite uma tarefa: ");
            String tarefa = sc.nextLine();
            atividades.add(tarefa);

            System.out.print("Deseja adicionar outra tarefa? (s/n): ");
            opcao = sc.nextLine();
        } while (!opcao.equals("n"));
*/

        Path arquivo = Paths.get("/home/francisco/Projects/testIO/tarefas.txt");
        //faz a escrita no arquivo
        Files.write(arquivo, atividades);

        // faz a leitura no arquivo
        List<String> minhasTarefas = Files.readAllLines(arquivo);

        //ler a lista minhasTarefas
        System.out.println("======= Tarefas para realizar hoje =======");
        for (String task : minhasTarefas) {
            System.out.println("Tarefa: " + task);
        }

        sc.close();
    }
}
