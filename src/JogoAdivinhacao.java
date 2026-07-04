import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner num = new Scanner(in);

        System.out.println("=== JOGO DE ADIVINHAÇÃO ===");
        int adv = new Random().nextInt(100);
        int tentativas = 5;

        for (int i = 1; i <= 5; i++){
            System.out.printf("Digitite um número para advinhar de 0 a 100, você tem %d tentativas: ", tentativas--);
            int numero = num.nextInt();

            if(adv == numero){
                System.out.println("Você acertou o numero: " + adv);
                break;
            }else if (adv > numero) {
                System.out.println("Seu numero é menor");
            } else if (adv < numero) {
                System.out.println("Seu numero é maior");
            }
        }

    }
}
