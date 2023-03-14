import java.util.Scanner;

public class ex2L2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final int tam = 100;

        double[] vet = new double [tam];
        int i;

        for (i = 0; i <= vet.length - 1; i++) {

            System.out.printf("Informe o valor %d do vetor: ", i + 1);
            vet[i] = input.nextDouble();

            if ((i + 1) % 10 == 0) {

                System.out.printf("Soma parcial após %d elementos: %.2f\n", i + 1, somaParcial(vet, i));

            }
        }

        System.out.printf("A soma dos elementos do vetor é: %.2f", somaParcial(vet, i));

    }

    public static double somaParcial(double[] vet, int posicao) {

        double soma = 0;
        int i;

        for (i = 0; i <= posicao; i++) {

            soma += vet[i];

        }

        return soma;
        
    }
}
