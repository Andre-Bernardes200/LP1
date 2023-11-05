import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio91 {

    private  int[] vetor = new int[50];
    private ArrayList<Integer> listaPosicoes = new ArrayList<>();
    public Exercicio91(){
        for(int i = 0; i < vetor.length;i++){
            vetor[i] = (int) Math.round(Math.random()*10);
        }
    }

    public void comparaNumEPosicoes(){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();

        int i =0;
        int contador = 0;
        while (i < vetor.length){
            if(vetor[i] == num){
                contador++;
                listaPosicoes.add(i +1);
            }
            i++;
        }
        System.out.println("O número aparece " + contador + " vezes");
        System.out.println("Suas posições são: " + listaPosicoes.toString());
    }

    @Override
    public String toString(){
        return Arrays.toString(vetor);
    }

    public static void main(String[] argd){
        Exercicio91 teste = new Exercicio91();
        System.out.println(teste.toString());
        teste.comparaNumEPosicoes();
    }
}
