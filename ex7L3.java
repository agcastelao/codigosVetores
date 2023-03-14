import java.beans.PersistenceDelegate;

import java.util.Scanner;

public class ex7L3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] candidatos = {"João", "Maria", "Pedro", "Luis", "Ana", "Luiza", "Silvia", "André"};
        int[] votos = new int [9];
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {

            System.out.println("Escolha um candidato para votar: ");
            System.out.println("0 - Voto em branco");

            for (int i = 0; i < candidatos.length ; i++) {

                System.out.println(i + " - Voto em " + candidatos[i-1]);

            }

            System.out.print("Opção: ");

            int opcao = input.nextInt();

            if (opcao >= 0 && opcao <= 8) {

                votos[opcao]++;

            }

            else {

                votos[8]++;

            }

            input.nextLine();

            System.out.println("Deseja votar de novo? (s/n)" );
            continuar = input.nextLine().charAt(0);

            while (continuar != 's' && continuar != 'S' && continuar != 'n' && continuar != 'N') {

                System.out.print("Resposta Invalida. Vote novamente: (s/n): ");
                continuar = input.nextLine().charAt(0);

            }

        }

        int totalVotos = 0;

        for (int i = 0; i < votos.length; i++) {

            totalVotos += votos[i];

        }

        double percentual;

        System.out.println("Resultado da eleição: ");

        for (int i = 0; i < candidatos.length; i++) {

            percentual = ((double) votos[i+1] / totalVotos) * 100;

            System.out.printf("%s: %2.2f\n", candidatos[i], percentual);

        }

        percentual = ((double) votos[0] / totalVotos) * 100;
        System.out.printf("Votos em branco: %.2f\n", percentual);

        percentual = ((double) votos[8] / totalVotos) * 100;
        System.out.printf("Votos nulos: %.2f\n", percentual);


    }
}
