import java.util.Scanner;

import static java.lang.System.in;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String nomePessoa = "Renan Teles";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int op = 1;

        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nomePessoa);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saudo atual: " + saldo);
        System.out.println("\n*****************************");

        String menu ="""
                    Bem vindo ao Menu, Por gentileza digite as opções correspondentes:
                    1 = Consultar Saldo
                    2 = Transferir Valor
                    3 = Receber Valor
                    (-1) = Ecerrar Programa!
                    """;


        while(op!=-1){
            System.out.println("\n*****************************");
            System.out.println(menu);
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println(saldo);
                    break;
                case 2:
                    System.out.println("Qual Valor deseja Tranfesrir?");
                    int tranferir = scanner.nextInt();
                    if (tranferir > saldo) {
                        System.out.println("Você não tem saldo suficiente!");
                    }else {
                        saldo -= tranferir;
                    }
                    break;
                case 3:
                    System.out.println("Qual valor vai receber: ");
                    int receber = scanner.nextInt();
                    saldo += receber;
                    System.out.println("Você recebeu " + receber);
                    break;
            }


        }

        scanner.close();

    }
}
