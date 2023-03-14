import java.util.Scanner;

public class ex1L3 {

    public static void main(String[] args) {

        final int tam = 12;

        double[] vetGanhos = new double[tam];
        double[] vetGastos = new double[tam];
        double[] vetLucros = new double[tam];
        
        preencherVetor(vetGanhos);
        preencherVetor(vetGastos);
        
        calcularLucros(vetGanhos, vetGastos, vetLucros);
        
        System.out.println("Vetor de ganhos:");
        exibirVetor(vetGanhos);
        
        System.out.println("Vetor de gastos:");
        exibirVetor(vetGastos);
        
        System.out.println("Vetor de lucros:");
        exibirVetor(vetLucros);

    }
    
    public static void preencherVetor(double[] vetor) {

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < vetor.length; i++) {

            System.out.print("Digite o valor da posição " + (i+1) + ": ");
            vetor[i] = input.nextDouble();

        }

    }
    
    public static void calcularLucros(double[] vetGanhos, double[] vetGastos, double[] vetLucros) {

        for (int i = 0; i < vetLucros.length; i++) {

            vetLucros[i] = vetGanhos[i] - vetGastos[i];

        }

    }
    
    public static void exibirVetor(double[] vetor) {

        for (double valor : vetor) {

            System.out.print(valor + " ");

        }

        System.out.println();

    }
    
}

