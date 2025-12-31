package _01_Fundamentos;

public class _10_RecursividadeVisual {
    // Adicionei o parâmetro 'espacos' apenas para formatação visual
    public static int calcularComRastro(int n, String espacos) {
        System.out.println(espacos + "-> Entrando na função com n = " + n);

        // CASO BASE
        if (n <= 1) {
            System.out.println(espacos + "   [BASE] Cheguei no 1. Vou retornar 1.");
            return 1;
        }

        // PASSO RECURSIVO
        System.out.println(espacos + "   Sou o " + n + ". Vou pausar e chamar o " + (n-1));

        // A mágica: chamamos a função passando mais espaços
        int respostaDoFilho = calcularComRastro(n - 1, espacos + "    | ");

        // A VOLTA (Desempilhando)
        System.out.println(espacos + "-> Voltei para o n=" + n + ". O filho (" + (n-1) + ") me devolveu: " + respostaDoFilho);

        int meuResultado = n * respostaDoFilho;
        System.out.println(espacos + "   Cálculo final do " + n + ": " + n + " * " + respostaDoFilho + " = " + meuResultado);

        return meuResultado;
    }

    public static void main(String[] args) {
        System.out.println("--- INÍCIO ---");
        int resultado = calcularComRastro(3, "");
        System.out.println("--- FIM ---");
        System.out.println("Resultado final: " + resultado);
    }
}
