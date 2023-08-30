import java.util.Scanner;

public class Exercicio15 {

    // Criando atributos
    private double num;

    // Criando métodos

    public void maiorQueZero(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        num = input.nextDouble();

        if(num >= 0){
            System.out.println("Número maior que zero");
        }else{
            System.out.println("Número menor que zero");
        }
    }
    public static void main(String [] args){
        Exercicio15 numero = new Exercicio15();

        numero.maiorQueZero();
    }
}
