public class Exercicio77 {

    public static void main(String[] args) {

    int numeros[] = {5, 1, 4, 2, 7, 8, 3, 6};

    for (int i = 7; i >= 5; i--){
        int aux = numeros[i];
        numeros[i] = numeros[8 - i + 1];
        numeros[i] = aux;
    }
    System.out.println(numeros[3] = numeros[1]);
    System.out.println(numeros[numeros[3]] = numeros[numeros[2]]);

}
}
