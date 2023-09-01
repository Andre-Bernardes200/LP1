import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio17 {
    Scanner input = new Scanner(System.in);

    // Atributo
    private ArrayList<Double> listaNotas = new ArrayList<Double>();
    private double nota;
    private double media;
    private double soma;

    // Criando método

    public ArrayList<Double> notas() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite uma nota:");
            nota = input.nextDouble();
            listaNotas.add(nota);
        }
        return listaNotas;
    }
    public double mediaAluno(){
        for (double notinha: listaNotas) {
            soma += notinha;
        }
        media = soma/listaNotas.size();
        return media;
    }

    public static void main(String[] args){

        // Iterando o objeto
        Exercicio17 media = new Exercicio17();

        media.notas();
        double passei = media.mediaAluno();

        if (passei >= 6){
            System.out.println("Você passou, sua média foi %.2f".formatted(passei));
        }else{
            System.out.println("Você não passou, sua média foi %.2f".formatted(passei));
        }

    }


}
