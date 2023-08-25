import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        double salario;
        double reajuste;
        double salarioReajustado;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        salario = input.nextDouble();

        System.out.println("Agora um percentual de reajuste: ");
        reajuste = input.nextDouble();

        salarioReajustado = salario * reajuste;

        System.out.println("Seu salário reajustado é R$ %.2f".formatted(salarioReajustado));
    }
}
