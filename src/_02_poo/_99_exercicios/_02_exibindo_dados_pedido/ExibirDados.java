package _02_poo._99_exercicios._02_exibindo_dados_pedido;

public class ExibirDados {

    public static void main(String[] args) {

//        Pedido pedido = new Pedido(1, 100.00, 10.00, 90.00);

        Pedido pedido = new Pedido(1, 100.00, 10.00);

        System.out.println("Código do Pedido: " + pedido.getCodigo() + "\nSubtotal: " + pedido.getSubtotal() + "\nDesconto: " +  pedido.getDesconto() + "\nTotal: " + pedido.getTotal());
    }
}
