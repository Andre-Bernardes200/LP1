import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args){
        double salario;
        double reajuste;
        double salarioReajustado;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        salario = input.nextDouble();

        System.out.print("Agora um percentual de reajuste: ");
        reajuste = input.nextDouble();

        salarioReajustado = salario * (1+ (reajuste/100));

        System.out.print("Seu salário reajustado é R$ %.2f".formatted(salarioReajustado));
    }
}
