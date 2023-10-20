public class Exercicio89 {

    private int[] vet1 = new int[15];
    private int[] vet2 = new int[15];

    private int quantidade;

    public Exercicio89(){
        int i = 0;
        while(i < 15){
            int num1 = (int) Math.round(Math.random() * 10);
            int num2 = (int) Math.round(Math.random() * 10);

            vet1[i] = num1;
            vet2[i] = num2;
            i++;
        }
    }

    public int comparaVetores(){
        int i = 0;
        while(i < 15){
            if(vet1[i] == vet2[i]){
                quantidade++;
            }
            i++;
        }
        return quantidade;
    }

    public static void main(String[] args){
        Exercicio89 vetores = new Exercicio89();

        System.out.println("A quantidade de números iguais nos vetores é " + vetores.comparaVetores());
    }
}
