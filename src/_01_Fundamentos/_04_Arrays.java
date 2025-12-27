package _01_Fundamentos;

public class _04_Arrays {
    public static void main(String[] args) {

        // já precisa adicionar o tamanho do array na inicializaçao, quando inicializado vazio
        String[] pizzaSabores = new String[3];
        pizzaSabores[0] = "Carne de Sol";
        pizzaSabores[1] = "Lombinho";
        pizzaSabores[2] = "Frango com Cheddar";

/*
        for (int i = 0; i < pizzaSabores.length; i++) {
            System.out.println(pizzaSabores[i]);
        }
*/

        // for melhorado
        System.out.println(" --- Lista de sabores disponíveis:");
        for (String pizzaSabor : pizzaSabores) {
            System.out.println(pizzaSabor);
        }

        //Array já preenchido na inicialização
        System.out.println(" --- Lista de lanches disponíveis:");
        String[] lanches = new String[]{"Batata Frita com Refrigerante", "Pastel de Frango", "Cachorro Quente", "Coxinha com Suco"};

        // modificando um item do array - Cachorro Quente por Açai
        lanches[2] = "Açai";

        for (String lanche : lanches) {
            System.out.println(lanche);
        }

        // -------- Vetores de 2 Dimensoes
        System.out.println("Vetores Bi-dimensionais:");
        Double faturamentoDia = 1000.00;

        Double[] faturamentoJaneiro = new Double[]{1200.00, 1500.00, 3000.00};
        Double[] faturamentoFevereiro = new Double[]{1900.00, 1100.00, 3400.00};

        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};

/*        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Mês: " + (i + 1));

            Double[] mes = faturamentoAnual[i];

            for (int j = 0; j < mes.length; j++) {
                Double dia = mes[j];
                System.out.println("Dia: " + (j + 1) + ": " + dia);
            }
        }        */

        for (int i = 0; i < faturamentoAnual.length; i++) {
            System.out.println("Mês: " + (i + 1));

            for (int j = 0; j < faturamentoAnual[i].length; j++) {
                System.out.println("Dia: 0" + (j + 1) + ": " + faturamentoAnual[i][j]);
            }
        }
    }
}
