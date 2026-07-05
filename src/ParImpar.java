import java.util.Scanner;

import static java.lang.System.in;

public class ParImpar {
    public static void main(String[] args) {
        Scanner num = new Scanner(in);
        int numero;

        System.out.println("Digite um número para verificar se é par ou impar:");
        numero = num.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("É impar");
        }
    }
}
