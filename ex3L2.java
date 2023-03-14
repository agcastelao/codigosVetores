import java.util.Scanner;

public class ex3L2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final int tam = 20;

        int[] vet = new int[tam];
        int i;

        for(i = 0; i <= vet.length - 1; i++) {

            System.out.printf("Informe o valor %d do vetor: ", i + 1);
            vet[i] = input.nextInt();

        }

        int maior = vet[0];
        int menor = vet[0];

        for (i = 1; i < tam; i++) {

            if (vet[i] > maior) {
                
                maior = vet[i];

            }

            if (vet[i] < menor) {

                menor = vet[i];

            }
        }

        System.out.printf("O maior valor armazenado é %d\n", maior);

        System.out.printf("O menor valor armazenado é %d", menor);
    }
}
