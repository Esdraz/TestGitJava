package _03_extras._01_leitura_escrita_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //array que guarda o que sera inserido em cada linha do arquivo
        ArrayList<String> linhas = new ArrayList<String>();

        //loop para interagir com usuario pedindo um produto e depois salvar o produto para escrever no arquivo
        for (int i = 0; i < 5; i++) {
            System.out.print("Pedido #" + (i + 1) + ": ");
            String produto = sc.nextLine();
            linhas.add(produto);
        }

        //caminho onde fica
        Path arquivo = Paths.get("/home/francisco/Projects/testIO/teste.txt");
        //precisa adicionar a excessao (throws) no metodo de assinatura
        //escreve os produtos no arquivo
        Files.write(arquivo, linhas);
        System.out.println("fim");
        sc.close();
    }
}
