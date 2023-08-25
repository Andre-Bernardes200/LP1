import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        double base;
        double altura;
        double area;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a base do retângulo: ");
        base = input.nextDouble();

        System.out.println("Agora a altura: ");
        altura = input.nextDouble();

        area = base * altura;

        System.out.println("A área do retângulo é " + area + " m2");
    }
}
