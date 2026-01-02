package _02_poo._99_exercicios._01_metodo_repor_estoque;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Super Nintendo";
        produto.quantidadeEmEstoque = 5;

        System.out.println("Precisa repor o estoque? " + verificaEstoque(produto));

    }

    static boolean verificaEstoque(Produto produto) {
//        if (produto.quantidadeEmEstoque < 10) {
//            return true;
//        } else {
//            return false;
//        }

        return produto.quantidadeEmEstoque < 10;
    }
}
