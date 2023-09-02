import java.util.Scanner;

public class Exercicio10 {
    public double custoDistrib(Double custo) {
        return custo * 0.28;
    }

    public double custoImposto(Double custo) {
        return custo * 0.45;
    }

    public static void main(String[] args){
        double custo;
        double custoTotal;
        Exercicio10 custo1 = new Exercicio10();

        Scanner input = new Scanner (System.in);

        System.out.println("Digite o custo de fábrica do carro: ");
        custo = input.nextDouble();

        custoTotal = custo + custo1.custoDistrib(custo) + custo1.custoImposto(custo);

        System.out.println("O custo total do carro é %.2f".formatted(custoTotal));

    }
}
