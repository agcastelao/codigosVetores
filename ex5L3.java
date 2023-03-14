import java.util.Scanner;

public class ex5L3 {
    
    public static void main(String[] args) {

    final int numALunos = 5;

    String[] nomes = new String[numALunos];
    double[] notas1 = new double[numALunos];
    double[] notas2 = new double[numALunos];
    double[] medias = new double[numALunos];
    String[] situacoes = new String[numALunos];
        
    preencheVetores(nomes, notas1, notas2, medias, situacoes);
    exibeMediasESituacoes(nomes, medias, situacoes);
        
    double mediaTurma = calculaMediaTurma(medias);

    System.out.println("A média da turma é " + mediaTurma);
        
    double percentualAbaixoDaMediaTurma = calculaPercentualAbaixoDaMediaTurma(medias, mediaTurma);

    System.out.printf("%.2f dos alunos ficaram abaixo da média da turma.", percentualAbaixoDaMediaTurma);

    }

    public static void preencheVetores(String[] nomes, double[] notas1, double[] notas2, double[] medias, String[] situacoes) {
        
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nomes.length; i++) {

            System.out.println("Digite o nome do aluno " + (i+1) + ": ");
            nomes[i] = input.nextLine();

            System.out.println("Digite a nota da primeira prova do aluno " + nomes[i] + ": ");
            notas1[i] = input.nextDouble();

            System.out.println("Digite a nota da segunda prova do aluno " + nomes[i] + ": ");
            notas2[i] = input.nextDouble();

            medias[i] = (notas1[i] * 2 + notas2[i] * 3) / 5;


            if (medias[i] >= 7) {

                situacoes[i] = "Aprovado";

            } 
            
            else if (medias[i] < 3) {

                situacoes[i] = "Reprovado";

            } 
            
            else {

                situacoes[i] = "Recuperação";

            }

            input.nextLine();

        }

        input.close();

    }
    
    public static void exibeMediasESituacoes(String[] nomes, double[] medias, String[] situacoes) {

        for (int i = 0; i < nomes.length; i++) {

            System.out.println("O aluno " + nomes[i] + " obteve média " + medias[i] + " e está " + situacoes[i] + ".");

        }

    }
    
    public static double calculaMediaTurma(double[] medias) {

        double soma = 0;

        for (int i = 0; i < medias.length; i++) {

            soma += medias[i];

        }

        return soma / medias.length;

    }
    
    public static double calculaPercentualAbaixoDaMediaTurma(double[] medias, double mediaTurma) {

        int abaixoDaMedia = 0;

        for (int i = 0; i < medias.length; i++) {

            if (medias[i] < mediaTurma) {

                abaixoDaMedia++;

            }

        }

        return (double)abaixoDaMedia / medias.length * 100;

    }

}
