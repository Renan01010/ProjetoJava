import java.util.Scanner;

import static java.lang.System.in;

public class Calculo {
    public static double quadrado(double lado){
        return lado * lado;
    }

    public static double circulo(double raio){
        double pi = 3.14159;
        return pi*(raio * raio);
    }

    public static void main(String[] args) {
        Scanner opcao = new Scanner(in);

        System.out.println("""
                1 - Calcualar Area do Quadrado.
                2 - Calcular Area do Circulo.
                """);
        int op = opcao.nextInt();

        if (op == 1){
            System.out.println("Você escolheu calcular a area do quadrado! \nDigite o lado");
            double lado = opcao.nextInt();

            double resultado = quadrado (lado);
            String result = Double.toString(resultado);
            System.out.println("A Area coresponde à " + result + " m²");
        }

        if (op == 2){
            System.out.println("Você escolheu calcular a area do circulo! \nDigite o raio");
            double raio = opcao.nextInt();

            double resultado = circulo(raio);
            System.out.println("A Area do circulo é " + resultado + " m²");
        }

        opcao.close();

    }
}
