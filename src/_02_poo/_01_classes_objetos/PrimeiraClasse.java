package _02_poo._01_classes_objetos;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "PS5";
        produto.precoUnitario = 3200.0;
        produto.quantidade = 10;

        exibirInformacoesDoProduto(produto);
    }

    static void exibirInformacoesDoProduto(Produto produto) {
        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Quantidade do produto: " + produto.quantidade);
        System.out.println("Preço unitário do produto: " + produto.precoUnitario);
    }
}
