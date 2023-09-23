import java.lang.Math;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio82 {

    // Criando atributos
    private int[] lista1 = new int[10];
    private int[] lista2 = new int[10];
    private int numero;

    // Criando os métodos
    public int[] getLista1(){
        for (int i = 0; i < 10; i++){
            lista1[i] = (int) (Math.random() * 100);
        }
        return lista1;
    }
    public int[] getLista2(int variavel){
        numero = variavel;
        for(int i = 0; i < 10; i++){
            lista2[i] = lista1[i] * numero;
        }
        return lista2;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Exercicio82 menor = new Exercicio82();
        int numero;

        System.out.print("Digite um número para multiplicar uma lista: ");
        numero = input.nextInt();

        System.out.print("""
                A lista número 1: %s
                A lista número 2: %s
                """.formatted(Arrays.toString(menor.getLista1()),Arrays.toString(menor.getLista2(numero))));
    }
}
