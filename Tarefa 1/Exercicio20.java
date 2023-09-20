import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio20 {

    // Declarando os atributos
    private ArrayList<Double> listaNumeros = new ArrayList<Double>();
    private Scanner input = new Scanner(System.in);
    private double valor;

    // Criando os métodos da classe
    public ArrayList<Double> lista (){
        while (listaNumeros.size() < 2){
            System.out.println("Digite um número: ");
            double numero = input.nextDouble();
            listaNumeros.add(numero);
        }
        return listaNumeros;
    }
    public ArrayList<Double> ordemCrescente(){
        if(listaNumeros.get(0) > listaNumeros.get(1)){
            valor = listaNumeros.get(0);
            listaNumeros.set(0,listaNumeros.get(1));
            listaNumeros.set(1,valor);
            return  listaNumeros;

        }else if(listaNumeros.get(0) < listaNumeros.get(1)){
            return listaNumeros;
        }else{
            listaNumeros.clear();;
            return lista();
        }
    }
    public ArrayList<Double> ordemDecrescente(){
        if(listaNumeros.get(0) > listaNumeros.get(1)){
            return listaNumeros;
        }else if(listaNumeros.get(0) < listaNumeros.get(1)){
            valor = listaNumeros.get(1);
            listaNumeros.set(1,listaNumeros.get(0));
            listaNumeros.set(0,valor);
            return listaNumeros;
        }else{
            listaNumeros.clear();;
            return lista();
        }
    }
    public static void main(String[] args){
        Exercicio20 lista = new Exercicio20();

        lista.lista();
        System.out.print("A lista em ordem crescente é " + lista.ordemCrescente());
        System.out.println();
        System.out.print("A lista em ordem decrescente é " + lista.ordemDecrescente());
    }
}
