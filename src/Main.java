public class Main{
    public static void main(String[] args) {
        System.out.println("Esse é op scream Match!");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String nomeFilme = "Top Gun: Maverick";

        double media = (9.8 + 6.3 + 8.0) / 3;

        //String.format utilizado para adicionar os %d %s %i, igual o printf em C
        System.out.println(String.format("%.2f",media));
        String sinopse;
        sinopse = """
                Filme Top Gun 
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
        String senha = "1234";

        if ( senha.equals("1234")){
            System.out.println("Senha correta!");
        }else{
            System.out.println("Senha incorreta!");
        }

        //Fazendo casting - resultado seria um double para int
        int classificacao = (int) (media /2);
        System.out.println(classificacao);

        double tempCelsius = 30.4;
        double tempFahrenheit = (tempCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura em Celsius é %f, em Fahreigth é %f", tempCelsius, tempFahrenheit);

        System.out.println(mensagem);

        int temperaturaFhInt = (int) tempFahrenheit;

        System.out.println("Temp int em Fh é: "+ temperaturaFhInt);

    }
}