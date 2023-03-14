import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        double n1[] = new double [3];
        double n2[] = new double [3];
        double media[] = new double [3];
        boolean sit[] = new boolean [3];
        int i;

        for (i = 0; i <= n1.length - 1; i++) {

            System.out.println("Preencha a primeira nota: ");
            System.out.printf("Aluno %s: ", i + 1);
            n1[i] = input.nextInt();

        }

        for (i = 0; i <= n2.length - 1; i++) {

            System.out.println("Preencha a segunda nota: ");
            System.out.printf("Aluno %s: ", i + 1);
            n2[i] = input.nextInt();
            
        }

        for (i = 0; i <= media.length - 1; i++) {

            media[i] = ((n1[i] * 2) + (n2[i] * 3)/ 5);
            
            System.out.println(media[i]);

        }


    }
}
