import java.util.Scanner;

public class ex4L3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        final int tam = 5;
        
        String[] nomes = new String[tam];
        double[] notas1 = new double[tam];
        double[] notas2 = new double[tam];
        double[] medias = new double[tam];
        String[] situacoes = new String[tam];
        
        preencherDadosAlunos(nomes, notas1, notas2, medias, situacoes, input);
        exibirDadosAlunos(nomes, medias, situacoes);
        double mediaTurma = calcularMediaTurma(medias);

        System.out.printf("A média da turma foi: %.2f\n", mediaTurma);
        
    }
    
    public static void preencherDadosAlunos(String[] nomes, double[] notas1, double[] notas2, double[] medias, String[] situacoes, Scanner input) {

        for (int i = 0; i < nomes.length; i++) {

            System.out.printf("Digite o nome do %dº aluno: ", i+1);
            nomes[i] = input.nextLine();
            
            System.out.printf("Digite a primeira nota do aluno %s: ", nomes[i]);
            notas1[i] = Double.parseDouble(input.nextLine());
            
            System.out.printf("Digite a segunda nota do aluno %s: ", nomes[i]);
            notas2[i] = Double.parseDouble(input.nextLine());
            
            medias[i] = calcularMediaAluno(notas1[i], notas2[i]);
            
            if (medias[i] >= 7.0) {

                situacoes[i] = "aprovado";

            } 
            
            else if (medias[i] < 3.0) {

                situacoes[i] = "reprovado";

            } 
            
            else {

                situacoes[i] = "em recuperação";

            }

        }

    }
    
    public static void exibirDadosAlunos(String[] nomes, double[] medias, String[] situacoes) {
        
        for (int i = 0; i < nomes.length; i++) {

            System.out.printf("O aluno %s obteve média %.2f e está %s.\n", nomes[i], medias[i], situacoes[i]);

        }

    }
    
    public static double calcularMediaAluno(double nota1, double nota2) {

        return (nota1 * 2.0 + nota2 * 3.0) / 5.0;

    }
    
    public static double calcularMediaTurma(double[] medias) {

        double soma = 0.0;

        for (int i = 0; i < medias.length; i++) {

            soma += medias[i];

        }

        return soma / (double) medias.length;

    }

}
