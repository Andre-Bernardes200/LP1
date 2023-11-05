import java.util.Arrays;
import java.util.Scanner;

public class Exercicio90 {

    private int[] vetor = new int[30];

    public Exercicio90(){
        int i = 0;
        while (i < 30) {
            int numAleatorio = (int) Math.round(Math.random()*10);
            vetor[i] = numAleatorio;
            i++;
        }
    }
    public void digitaNum(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int contador = 0;
        for(int i = 0; i < vetor.length; i++){
            contador = (vetor[i] == num ? contador +=1 : contador );
        }
        System.out.println(contador);
    }
    @Override
    public String toString(){
        return Arrays.toString(vetor);
    }
    public static void main(String[] args){
        Exercicio90 teste = new Exercicio90();
        System.out.println(teste.toString());
        teste.digitaNum();
    }
}
