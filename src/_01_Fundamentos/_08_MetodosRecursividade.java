package _01_Fundamentos;

public class _08_MetodosRecursividade {
    public static void main(String[] args) {

        String[] alunos = new String[]{"Maria", "Pedro", "Jose"};

        imprimirNumero(0);
        iterarNomes(alunos, 0);
    }

    static void iterarNomes(String[] alunos, Integer i) {
        System.out.println("Aluno: " + alunos[i]);
        if (++i < alunos.length) {
            iterarNomes(alunos, i);
        }
    }

    //recursividade é quando um metodo chama a si mesmo
    static void imprimirNumero(Integer numero) {
        System.out.println("Número: " + numero);

        if (numero < 10) {
            imprimirNumero(++numero);
        }
    }

}
