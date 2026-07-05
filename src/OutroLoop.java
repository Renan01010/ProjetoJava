import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int count = 0;
        int rep = 10;

        //Faz o casting para colocar double em int e fazer a verificação
        while ((rep = (int) nota)!=-1) {
            System.out.println("Diga sua avaliação para o filme  ");
            System.out.println("Digite -1 (Menos Um) e encerra o programa!");
            nota = leitura.nextDouble();

            if(nota != -1){
                media += nota;
                count++;
            }
        }

        System.out.println("Média de avaliação " + media/count);
        System.out.println(media);
        System.out.println(count);

        leitura.close();
    }
}
