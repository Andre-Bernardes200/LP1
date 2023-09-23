import  java.lang.Math;
import java.util.ArrayList;

public class Exercicio81 {

    // Criando os atributos
    private ArrayList <Integer> numeros = new ArrayList<>();
    private int numero;
    private int quantidadeNumeros;

    public Exercicio81 (int quantidadeNumeros){
        this.quantidadeNumeros = quantidadeNumeros;
    }

    public ArrayList<Integer> pegaNumeros(){
        for(int i = 0; i < this.quantidadeNumeros; i++){
            numero = (int) (Math.random() * 100);
            numeros.add(numero);
        }
        return  numeros;
    }

    public void menorNumero(){
        int posicaoNumero = 0;
        int menorNumero = numeros.get(posicaoNumero);

        for (int i = 0; i < numeros.size(); i ++){
            if (numeros.get(i) < menorNumero){
                posicaoNumero = i + 1;
                menorNumero = numeros.get(i);
            }
        }
        System.out.println("""
                O menor número da lista é %d e sua posição é %d
                """.formatted(menorNumero,posicaoNumero));
    }
    public static void main(String[] args){

        Exercicio81 numero = new Exercicio81(20);

        ArrayList<Integer> lista = numero.pegaNumeros();
        System.out.println(lista);
        numero.menorNumero();
    }
}
