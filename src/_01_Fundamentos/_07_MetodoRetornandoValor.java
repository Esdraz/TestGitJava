package _01_Fundamentos;

public class _07_MetodoRetornandoValor {
    public static void main(String[] args) {

        Double[] premissaInicial = new Double[]{725.5, 100.0};
        Double proporcao = 20.0;

        Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
        System.out.println("Resultado: " + resultadoFinal);
    }

    //metodo retornando um Double
    static Double regraDeTres(Double[] premissa, Double proporcao) {

//        Outra forma de retornar o valor do metodo
//        Double resultado = (premissa[0] * proporcao) / premissa[1];
//        return resultado;

        return (premissa[0] * proporcao) / premissa[1];
    }
}
