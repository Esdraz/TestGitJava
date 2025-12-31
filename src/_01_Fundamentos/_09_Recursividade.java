package _01_Fundamentos;

public class _09_Recursividade {

    public static int calcularFatorial(int n) {
        // 1. CASO BASE: Se n for 0 ou 1, o fatorial é 1.
        // Sem isso, o método chamaria a si mesmo infinitamente.
        if (n <= 1) {
            return 1;
        }

        // 2. PASSO RECURSIVO: n * fatorial de (n-1)
        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {
        //calculando fatorial de 3!
        int numero = 3;
        int resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }

}
