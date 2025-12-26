package _01_Fundamentos;

public class _03_EstruturasRepeticao {
    public static void main(String[] args) {

        int numeroWhile = 0;
        int numeroDo = 0;

        System.out.println(" --- while ---");
        while (numeroWhile < 5) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println(" --- do/while ---");
        do {
            System.out.println(numeroDo);
            numeroDo++;
        } while (numeroDo < 11);

        //for - precisa do valor inicial, final e a iteração

        System.out.println(" --- for ---");
        for (int i = 1; i < 5; i++) {
            System.out.println("Contando... " + i);
        }
    }
}
