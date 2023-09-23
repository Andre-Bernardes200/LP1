import java.util.ArrayList;
import java.lang.Math;

public class Exercicio83 {

    // Criando os atributos
    private ArrayList<Integer> lista = new ArrayList<>();
    private ArrayList<Integer> listaInvertida = new ArrayList<>();
    int quantidade;

    // Criando o construtor
    public Exercicio83 (int quantidade) {
        this.quantidade = quantidade;
    }

    // Criando métodos
    public ArrayList<Integer> pegandoValores(){
        int i = 0;
        while (i < 20){
            int numero = (int) (Math.random() * 100);
            lista.add(numero);
            i++;
        }
        return lista;
    }

    public ArrayList<Integer> listaInvertida(){
        int i = 0;
        while (i < lista.size()){
            int posicao = 19-i;
            int numero = lista.get(posicao);
            listaInvertida.add(numero);
            i++;
        }
        return listaInvertida;
    }
    public static void main(String[] args){
        Exercicio83 lista = new Exercicio83(20);

        ArrayList<Integer> listaNormal = lista.pegandoValores();
        ArrayList<Integer> listaInvertida = lista.listaInvertida();

        System.out.println("Lista normal " + listaNormal);
        System.out.println("Lista invertida " + listaInvertida);
    }
}
