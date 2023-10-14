import java.util.ArrayList;

public class Exercicio87 {
    // Atributos
    private ArrayList<Integer> vetor = new ArrayList<>();

    public Exercicio87 (){
        int i = 0;
        while ( i < 10){
            int num = (int) (Math.round(Math.random() * 100));
            vetor.add(num);
            i++;
        }
    }
    public ArrayList<Integer> organizaVetor() {
        int n = vetor.size();

        for (int i = 0; i < n - 1; i++) {
            int posMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor.get(j) < vetor.get(posMenor)) {
                    posMenor = j;
                }
            }
            int num2 = vetor.get(i);
            vetor.set(i, vetor.get(posMenor));
            vetor.set(posMenor, num2);
        }

        return vetor;
    }

    public void acrescentaNum(int num){
        vetor.add(num);
    }

    @Override
    public String toString(){
        return vetor.toString();
    }
    public static void main(String[] args){
        Exercicio87 lista = new Exercicio87();

        lista.acrescentaNum(5);
        System.out.println(lista.organizaVetor());
    }
}
