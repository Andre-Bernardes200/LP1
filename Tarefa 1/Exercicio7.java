import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){
        int anoIdade;
        int mesIdade;
        int diaIdade;
        int idadeEmDia;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        anoIdade = input.nextInt();

        System.out.println("Digite a idade em meses: ");
        mesIdade = input.nextInt();

        System.out.println("Digite em dias: ");
        diaIdade = input.nextInt();

        idadeEmDia = anoIdade * 365 + mesIdade * 30 + diaIdade;
        System.out.println("Você tem " + idadeEmDia + " dias de idade");

    }
}
