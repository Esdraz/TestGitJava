package _03_extras._01_leitura_escrita_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("/home/francisco/Projects/testIO/tarefas.txt");
        List<String> linhas = Files.readAllLines(arquivo);

        for (String linha : linhas) {
            System.out.println("Tarefa: [ ] " + linha);
        }

    }
}
