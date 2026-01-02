package _02_poo._02_metodo_instancia;

public class Cliente {

    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;

    String obterNomeCompleto() {
        return primeiroNome + " " + ultimoNome;
    }
}
