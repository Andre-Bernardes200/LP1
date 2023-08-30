import java.util.Scanner;

public class Exercicio14 {

    // Criando atributo
    private double numero;

    // Criando método
    public double getNumero(){
        return  this.numero;
    }
    public void maiorOuMenor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Diga um número:");
        numero = input.nextDouble();

        if(numero > 10){
            System.out.println("O número é maior que 10");
        }else{
            System.out.println("Seu número é menor ou igual a 10");
        }
    }

    public static void main(String[] args){

        Exercicio14 num = new Exercicio14();

        num.maiorOuMenor();
        System.out.println("Já que o número digitado foi " + num.getNumero());

    }
}
