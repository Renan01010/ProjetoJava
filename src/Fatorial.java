import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;

public class Fatorial {
    public static void main(String[] args) {
        Scanner num = new Scanner(in);

        System.out.println("Digite um numero para saber o fatorial: ");
        int numero = num.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numero ; i++) {
            if (numero != -1) {
//                System.out.printf("%d x %d \n", i, fatorial);
                fatorial = i * fatorial;
            }else {
                break;
            }
        }
        System.out.println(fatorial);
        num.close();

    }
}
