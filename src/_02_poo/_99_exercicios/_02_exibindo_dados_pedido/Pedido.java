package _02_poo._99_exercicios._02_exibindo_dados_pedido;

public class Pedido {
    private int codigo;
    private double subtotal;
    private double desconto;
//    private double total;

/*      //Parte #01 exercicio
        public Pedido(int codigo, double subtotal, double desconto, double total) {
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.desconto = desconto;
        this.total = total;
    }*/

    //parte #02 removido o att total
    public Pedido(int codigo, double subtotal, double desconto) {
        this.codigo = codigo;
        this.subtotal = subtotal;
        this.desconto = desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotal() {
        return subtotal - desconto;
    }

/*  //parte #01 exercicio
    public void setTotal(double total) {
        this.total = total;
    }*/
}
