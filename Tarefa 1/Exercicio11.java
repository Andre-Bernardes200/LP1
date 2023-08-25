import java.util.Scanner;

public class Exercicio11 {

    // Atributos da classe.
    private String name;

    //Método construtor
    public Exercicio11 (String name) {
        this.name = name;
    }

    // Métodos da classe.

    public String getName(){
        return this.name;
    }
    public double totalComission (double salesTotals){
        return salesTotals * 0.05;
    }
    public double salesTotalCars (double valuePerCar, int salesCars){
        return salesCars * valuePerCar;
    }

    public static void main(String [] args){
        Exercicio11 employee = new Exercicio11("André Luiz");
        Scanner input = new Scanner(System.in);

        double valuePerCar;
        int salesCars;
        double salesTotals;
        double salary;
        double totalSalary;


        System.out.println("Digite seu salário fixo: ");
        salary = input.nextDouble();

        System.out.println("Quantidade de carros vendidos: ");
        salesCars = input.nextInt();

        System.out.println("Valor total das vendas: ");
        salesTotals = input.nextDouble();

        System.out.println("Valor que recebe por carro vendido: ");
        valuePerCar = input.nextDouble();

        totalSalary = salary +  employee.totalComission(salesTotals) + employee.salesTotalCars(valuePerCar, salesCars);

        System.out.println("%s seu salário total é %.2f".formatted(employee.getName(),totalSalary));
    }
}
