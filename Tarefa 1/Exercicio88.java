import java.util.Arrays;

public class Exercicio88 {

    // Criando atributos
    private int[] list = new int[20];
    private int[] list2 = new int[20];
    public Exercicio88(){
        int i = 0;
        while(i < 20){
            int num = (int) (Math.round(Math.random() * 100));
            list[i] = num;
            int a = i+1;
            while(a < list.length){
                if(list[i] == list[a]) {
                    num = (int) (Math.round(Math.random() * 100));
                    list[i] = num;
                }
                a++;
            }
            i++;
        }
    }

    // Método para verificar se o número passado existe na lista original
    public int[] verificaVetor(int numero){
        int i = 0;
        while (i < list.length){
            if(numero != list[i]){
                list2[i] = list[i];
            }
            i++;
        }
        return list2;
    }
    // Método para transformar vetor em lista
    public String toString(int[] lista){
        return Arrays.toString(lista);
    }

    public static void main(String[] args){
        Exercicio88 lista = new Exercicio88();

        int[] list = lista.verificaVetor(20);
        System.out.println("Lista: " + lista.toString(list));

    }
}
