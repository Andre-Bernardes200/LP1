import java.util.Scanner;

public class Exercicio22 {

    // Criando atributos
    private int horaSemanal = 40;
    private int divisor = horaSemanal * 4;
    private double salario;
    private double salarioHora;
    private int horasMes;
    private int horasExtras;
    private double salarioTotal;

    //Criando métodos

    private double calculaSalarioHora(double salario){
        salarioHora = salario/divisor;
        return  salarioHora;
    }
    private double quantidadeHorasExtras(int horasMes){
        horasExtras = horasMes - divisor;
        return horasExtras;
    }
    public double salarioComHorasExtras(double salario, int horasMes){
        salarioTotal = salario + (calculaSalarioHora(salario) * (quantidadeHorasExtras(horasMes) * 1.5));
         return salarioTotal;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Exercicio22 salarioMes = new Exercicio22();

        double salario;
        int horasTrabalhadasMes;

        System.out.print("Qual o seu salário mensal: ");
        salario = input.nextDouble();
        System.out.print("Agora digite as horas trabalhadas no mês: ");
        horasTrabalhadasMes = input.nextInt();

        System.out.println("""
                O salário com horas extras é %.2f
                """.formatted(salarioMes.salarioComHorasExtras(salario,horasTrabalhadasMes)));

    }
}
