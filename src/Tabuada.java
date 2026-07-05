import java.util.Scanner;

import static java.lang.System.in;

public class Tabuada {
    public static void main(String[] args) {
        Scanner tab = new Scanner(in);
        System.out.println("Digite um numero de 0 a 10 para apresentar a tabuada.");
        int num = tab.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d X %d = %d\n", num, i, num*i);
        }

    }
}
