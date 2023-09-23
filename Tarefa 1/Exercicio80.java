import java.util.ArrayList;
import java.lang.Math;

public class Exercicio80 {

    // Criando atributos
    private ArrayList<Integer> numeros = new ArrayList<>();
    private int quantidadeNumeros;

    // Criando construtor
    public Exercicio80(int quantidadeNumeros){
        this.quantidadeNumeros = quantidadeNumeros;
    }

    // Criando métodos

    public ArrayList<Integer> pegandoValores(){
        int numero = 0;
        while(numeros.size() < this.quantidadeNumeros){
            numero = (int) (Math.random() * 100);
            numeros.add(numero);
            }
        return numeros;
        }
    public void maiorNumero(){
        int contador = 0;
        int maior = numeros.get(0);
        int posicaoMaior = 0;


        while (contador < numeros.size()){
            if(numeros.get(contador) > maior){
                posicaoMaior = contador + 1;
                maior = numeros.get(contador);
            }
            contador++;
        }
        System.out.println("""
                O maior número é %d e está na posição %d
                """.formatted(maior,posicaoMaior));
    }
    public static void main(String[] args){
        Exercicio80 maior = new Exercicio80(20);

        ArrayList<Integer> lista = maior.pegandoValores();
        System.out.println(lista);
        maior.maiorNumero();
    }
    }
