import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero;

        System.out.print("Digite um número: ");
        numero = input.nextDouble();

        if (numero > 0) {
            System.out.println("Maior que zero");
        }else if(numero < 0){
            System.out.println("Menor que zero");
        }else{
            System.out.println("Igual a zero");
        }
    }
}
