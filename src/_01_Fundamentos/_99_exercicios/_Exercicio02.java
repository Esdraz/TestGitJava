package _01_Fundamentos._99_exercicios;

public class _Exercicio02 {
    public static void main(String[] args) {

        /*
        Os quatro primeiros vetores estão guardando o faturamento diário de cada semana e o último vetor,
        que é de 2 dimensões, guarda o faturamento mensal separado por semanas.
        Crie um algoritmo que encontre qual a semana teve o maior faturamento.
        No final mostre qual foi essa semana e de quanto foi esse faturamento.
        */

        Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

        Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

        Double maiorFaturamento = 0.0;
        int semanaMaiorFaturamento = 0;

        for (int semanaMes = 0; semanaMes < mes.length; semanaMes++) {
            double somaSemana = 0.0;
            for (int diaSemana = 0; diaSemana < mes[semanaMes].length; diaSemana++) {
                somaSemana += mes[semanaMes][diaSemana];
            }

            if (somaSemana > maiorFaturamento) {
                maiorFaturamento = somaSemana;
                semanaMaiorFaturamento = semanaMes;
            }
        }

        System.out.println("A semana " + (semanaMaiorFaturamento + 1) + " ganhou! Com faturamento de R$:" + maiorFaturamento);

    }
}
