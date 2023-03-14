import java.util.Scanner;

public class ex3L3 {
    
    public static void main(String[] args) {

        final int numAlunos = 5;

        String[] nomes = new String[numAlunos];
        double[] notas1 = new double[numAlunos];
        double[] notas2 = new double[numAlunos];
        double[] medias = new double[numAlunos];
        String[] situacoes = new String[numAlunos];

        preencherDados(nomes, notas1, notas2, medias, situacoes);
        exibirResultados(nomes, medias, situacoes);

    }

    public static void preencherDados(String[] nomes, double[] notas1, double[] notas2, double[] medias, String[] situacoes) {
             
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {

            System.out.printf("Digite o nome do aluno %d: ", i+1);
            nomes[i] = input.nextLine();

            System.out.printf("Digite a primeira nota do aluno %d: ", i+1);
            notas1[i] = Double.parseDouble(input.nextLine());

            System.out.printf("Digite a segunda nota do aluno %d: ", i+1);
            notas2[i] = Double.parseDouble(input.nextLine());

            medias[i] = (notas1[i] * 2 + notas2[i] * 3) / 5;


            if (medias[i] >= 7) {

                situacoes[i] = "aprovado";

            } 
            
            else if (medias[i] < 3) {

                situacoes[i] = "reprovado";

            } 
            
            else {

                situacoes[i] = "em recuperação";

            }

        }

    }

    public static void exibirResultados(String[] nomes, double[] medias, String[] situacoes) {

        for (int i = 0; i < nomes.length; i++) {

            System.out.printf("O aluno %s obteve média %.2f e está %s.%n", nomes[i], medias[i], situacoes[i]);
                              
        }

    }
    
}
