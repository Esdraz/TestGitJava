package _01_Fundamentos;

import java.io.File;

public class _11_RecursividadeExemploReal {
    public static void listarArquivos(File diretorio) {
        // Obtém a lista de arquivos e pastas dentro do diretório atual
        File[] arquivos = diretorio.listFiles();

        // Verificação de segurança (caso o diretório esteja vazio ou inacessível)
        if (arquivos != null) {
            for (File arquivo : arquivos) {

                // 1. PASSO RECURSIVO: Se for um diretório, chama o método novamente
                if (arquivo.isDirectory()) {
                    System.out.println("Pasta: " + arquivo.getName());
                    listarArquivos(arquivo); // <--- A mágica acontece aqui
                }
                // 2. CASO BASE (implícito): Se for arquivo, apenas imprime e segue o loop
                else {
                    System.out.println("   Arquivo: " + arquivo.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        // Troque pelo caminho de uma pasta no seu PC
        File pastaInicial = new File("./src");
        listarArquivos(pastaInicial);
    }
}
