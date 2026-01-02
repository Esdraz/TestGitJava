package _02_poo._02_metodo_instancia;

public class MetodoInstancia {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Francisco";
        cliente.ultimoNome = "Sousa";
        cliente.telefone = "99999-3333";
        cliente.email = "fsfsfs@gmail.com";

        System.out.println("Nome completo: " + cliente.obterNomeCompleto());

    }
}
