import java.util.Scanner;

import static java.lang.System.in;

public class ComparacaoNumero {
    public static void main(String[] args) {
        Scanner num = new Scanner(in);
        System.out.println("Insira dois numeros inteiros: ");
        int num1 = 0;
        int num2 = 0;

        for (int i = 0; i < 2; i++) {
            if(i == 0){
                num1 = num.nextInt();
            }else{
                System.out.println("Agora o segundo numero");
                num2 = num.nextInt();
            }
        }
        if (num1 == num2) {
            System.out.println("Iguais");
        }else {
            System.out.println("Diferentes");
        }
        if(num1 > num2) {
            System.out.println("Primeiro é maior que o segundo");
        }else {
            System.out.println("O segundo é mair");
        }

        num.close();
    }
}
