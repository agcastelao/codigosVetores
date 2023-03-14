import java.security.SecureRandom;

public class exL4 {
    
    public static int sorteiaFace() {

        SecureRandom random = new SecureRandom();
        return random.nextInt(6);

    }
    
    public static int[] realizarSimulacao() {

        final int chances = 1000000;

        int[] resultados = new int[6];

        for (int i = 0; i < chances; i++) {

            int face = sorteiaFace();
            resultados[face]++;

        }

        return resultados;

    }
    
    public static void exibeResultado(int[] resultados) {

        System.out.println("Número de ocorrências de cada face do dado:");

        for (int i = 0; i < 6; i++) {

            System.out.println("Face " + (i+1) + ": " + resultados[i]);

        }

    }
    
    public static void main(String[] args) {

        int[] resultados = realizarSimulacao();
        exibeResultado(resultados);

    }

}
