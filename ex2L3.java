import java.util.Scanner;

public class ex2L3 {

    public static void main(String[] args) {

    final int tam = 12;

    double[] vetGanhos = new double[tam];
    double[] vetGastos = new double[tam];
    double[] vetLucros = new double[tam];

    System.out.println("Preenchimento do vetor de ganhos:");
    preencherVetor(vetGanhos);

    System.out.println("\nPreenchimento do vetor de gastos:");
    preencherVetor(vetGastos);

    calcularLucros(vetGanhos, vetGastos, vetLucros);

    System.out.println("\nGanhos:");
    exibirVetor(vetGanhos);

    System.out.println("\nGastos:");
    exibirVetor(vetGastos);

    System.out.println("\nLucros:");
    exibirVetor(vetLucros);

    double totalGanhos = somarVetor(vetGanhos);
    double totalGastos = somarVetor(vetGastos);
    double totalLucros = somarVetor(vetLucros);

    System.out.printf("\nTotal de ganhos: R$ %.2f\n", totalGanhos);
    System.out.printf("Total de gastos: R$ %.2f\n", totalGastos);
    System.out.printf("Lucro total: R$ %.2f\n", totalLucros);

    }

    public static void preencherVetor(double[] vetor) {

        Scanner input = new Scanner(System.in); 

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Digite o valor do mês %d: ", i + 1);
            vetor[i] = input.nextDouble();

        }
        
    }

    public static void calcularLucros(double[] vetGanhos, double[] vetGastos, double[] vetLucros) {

        for (int i = 0; i < vetLucros.length; i++) {

            vetLucros[i] = vetGanhos[i] - vetGastos[i];

        }
        
    }

    public static double somarVetor(double[] vetor) {

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {

            soma += vetor[i];

        }

        return soma;
        
    }

    public static void exibirVetor(double[] vetor) {

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Mês %d: R$ %.2f\n", i+1, vetor[i]);

        }
        
    }

}
