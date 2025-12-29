package _01_Fundamentos;

public class _06_Metodos {
    public static void main(String[] args) {
        String[] lanches = {"Coxinha", "Pastel", "Torta de Frango", "Calzone", "Mini Pizza"};

        iterarNoVetor(lanches);

        imprimir("Olá, estou usando um método!");
    }

    //metodo com parametro
    static void imprimir(String text) {
        System.out.println(text);
    }

    static void iterarNoVetor (String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Opção de lanche #0" + (i + 1) + ": " + vetor[i]);
        }
    }
}
