import java.util.Scanner;

import static java.lang.System.in;

public class SolicitacaoUsuario {
    public static void main(String[] args) {
        System.out.println("Digite um numero: ");
        Scanner num = new Scanner(in);

        int numero = num.nextInt();

        if (numero>0){
            System.out.println("Positivo");
        }else {
            System.out.println("Negativo");
        }
    }
}
