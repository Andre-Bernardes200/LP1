import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        int totalEleitores;
        int votosBranco;
        int votosNulos;
        int votosValidos;
        double percentualBranco;
        double percentualNulos;
        double percentualValidos;

        Scanner input = new Scanner (System.in);

        System.out.println("Digite o total de eleitores: ");
        totalEleitores = input.nextInt();

        System.out.println("Digite os votos em branco: ");
        votosBranco = input.nextInt();

        System.out.println("Digite os votos nulos: ");
        votosNulos = input.nextInt();

        System.out.println("Digite os votos válidos: ");
        votosValidos = input.nextInt();

        percentualValidos = (votosValidos * 100) / totalEleitores;
        percentualBranco = (votosBranco * 100 ) / totalEleitores;
        percentualNulos = (votosNulos * 100) / totalEleitores;

        System.out.println("""
                Total eleitores: %d
                Percentual válidos: %.2f
                Percentual brancos: %.2f
                Percentual nulos: %.2f
                """.formatted(totalEleitores,percentualValidos,percentualBranco,percentualNulos));
    }
}
