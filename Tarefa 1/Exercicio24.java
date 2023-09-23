import java.util.Scanner;

public class Exercicio24 {

    // Criando atributos
    private double salario;
    private double salarioTotal;
    private double valorTotalVendas;
    private double comissao;

    // Crindo métodos
    private double valorComissao(double valorTotalVendas){
        if(valorTotalVendas > 1500){
            comissao = (1500 *0.03) + ((valorTotalVendas - 1500) * 0.05);
            return comissao;
        }else{
            comissao = valorTotalVendas * 0.03;
            return  comissao;
        }
    }
    public double calculaSalario(double salario, double valorTotalVendas){
        salarioTotal = salario + valorComissao(valorTotalVendas);
        return salarioTotal;
    }
    public static void main(String[] args){
        Exercicio24 salario = new Exercicio24();
        Scanner input = new Scanner(System.in);
        double salary;
        double totalVendas;

        System.out.print("Qual é o seu salário fixo em R$: ");
        salary = input.nextDouble();
        System.out.print("Agora fale o total de vendas em R$: ");
        totalVendas = input.nextDouble();

        double salarioTotal = salario.calculaSalario(salary,totalVendas);
        System.out.println("\nSeu salário é de R$ %.2f".formatted(salarioTotal));
    }

}
