import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;
        int A[] = new int [3];
        int B[] = new int [3];
        int C[] = new int [3];

        for (i = 0; i <= A.length - 1; i++) {

            System.out.println("Preencha o vetor A: ");
            System.out.printf("Posição %s: ", i + 1);
            A[i] = input.nextInt();

        }

        for (i = 0; i <= B.length - 1; i++) {

            System.out.println("Preencha o vetor B: ");
            System.out.printf("Posição %s: ", i + 1);
            B[i] = input.nextInt();

        }

        for (i = 0; i <= C.length - 1; i++) {

            C[i] = A[i] + B[i];

        }
    
        System.out.println("A soma do Vetor A com o Vetor B é:");
        System.out.println(C[]);
    
    }
}
