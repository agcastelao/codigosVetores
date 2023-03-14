import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] A = new int [3];
        int[] B = new int [3];
        int i;

        for (i = 0; i <= A.length - 1; i++) {

            System.out.printf("Posição %s do vetor: ", i+1);
            System.out.println();

            A[i] = input.nextInt();

        }

        for (i = 0; i <= B.length - 1; i++) {

            if (i % 2 == 0) {

                B[i] == A[i] * 2;

            }

            else {

                B[i] == A[i] * 3;
            }
        }

        System.out.printf("Vetor A: %s", A[]);
        System.out.println();
        System.out.printf("Vetor B: %s", B[]);
    }
}
