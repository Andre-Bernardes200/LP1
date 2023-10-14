import java.util.Arrays;

public class Exercicio84 {

    private int tamanhoVetor;
    private int[] vetor1;
    private int[] vetor2;
    private int[] vetor3;

    public Exercicio84(int tamanhoVetor){
        this.tamanhoVetor = tamanhoVetor;
    }

    public void vet1(){
        vetor1 = new int[this.tamanhoVetor];
        for(int i =0; i < this.tamanhoVetor ; i++){
            vetor1[i] = (int) (Math.round(Math.random() * 100));
        }
        System.out.println("O vetor um contém: " +  Arrays.toString(vetor1));
    }
    public void vet2(){
        vetor2 = new int[this.tamanhoVetor];
        for(int i =0; i < this.tamanhoVetor ; i++){
            vetor2[i] = (int) (Math.round(Math.random() * 100));
        }
        System.out.println("O vetor dois contém: " + Arrays.toString(vetor2));
    }
    public void vet3(){
        vetor3 = new int[this.tamanhoVetor];
        for(int i =0; i < this.tamanhoVetor; i++){
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        System.out.println("Soma dos vetores: " +  Arrays.toString(vetor3));
    }

    public static void main(String[] args){

        Exercicio84 vetores = new Exercicio84(5);

        vetores.vet1();
        vetores.vet2();
        vetores.vet3();

    }
}
