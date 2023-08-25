import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();
        System.out.println("Numero antecessor é " + (numero - 1));

    }
}
