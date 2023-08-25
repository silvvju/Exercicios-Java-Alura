import java.util.Random;
import java.util.Scanner;

public class JogodeAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("Bem vindo/a ao Fantástico Jogo de Adivinhação! Você terá 5 tentativas para acertar um número aleatório entre 0 e 100.");

        int contador = 1;
        while (contador <=5) {
            System.out.println("Tentativa " + contador + ": Insira um número aleatório entre 0 e 100");
            int tentativa = leitura.nextInt();

            if (tentativa == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o Jogo de Adivinhação");
                break;
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Insira um número maior!");
            } else {
                System.out.println("Insira um número menor!");
            }
            contador++;
        }

        if (contador > 5) {
            System.out.println("Infelizmente suas tentativas se esgotaram! O número correto era: " + numeroAleatorio);
        }

    }
}
