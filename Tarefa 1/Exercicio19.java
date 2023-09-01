import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio19 {
    //Declarando os atributos
    private ArrayList<Double> lista = new ArrayList<Double>();
    private Scanner input = new Scanner(System.in);

    // Criando o método
    public ArrayList<Double> digitaNumero(){
        while(lista.size() < 2 ){
            System.out.println("Digite um número");
            double numero = input.nextDouble();
            lista.add(numero);
        }
        return lista;

    }
    public double maiorNumero(){
        if(lista.get(0) > lista.get(1)){
            return  lista.get(0);
        }else if (lista.get(0) < lista.get(1)){
            return  lista.get(1);
        }else{
            return 0;
        }
    }


    public static void main(String[] args){
        Exercicio19 maior = new Exercicio19();

        maior.digitaNumero();
        while (maior.maiorNumero() == 0){
            System.out.println("\nVocê digitou números iguais.");
            maior.digitaNumero().clear();
            maior.digitaNumero();
        }
        System.out.println("O maior número é o " + maior.maiorNumero());
    }
}
