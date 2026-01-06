package _02_poo._04_classe_vs_instancia;

public class ClasseInstancia {
    public static void main(String[] args) {
        /*
         * A classe é o molde de como um objeto pode ser construido
         * A instancia é o objeto criado apartir do molde, que segue o padrao base
         * porem pode ter suas proprias caracteristicas. A instancia ocupa espaço na memoria.
        */
        System.out.println("Quantidade minina estoque: " + Produto.quantidadeMininaProduto);

        //primeira instancia
        Produto primeiroProduto = new Produto();
        primeiroProduto.nome = "PS5";

        //segunda instancia
        Produto segundoProduto = new Produto();
        segundoProduto.nome = "PC";

        Produto.quantidadeMininaProduto = 10;
        System.out.println("Quantidade minina estoque: " + Produto.quantidadeMininaProduto);

        System.out.println("Produto: " + primeiroProduto.nome);
        System.out.println("Produto: " + segundoProduto.nome);
    }
}
