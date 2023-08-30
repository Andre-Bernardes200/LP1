import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exercicio13 {
    Scanner input = new Scanner (System.in);

    // Atributos
    private String nome;
    private ArrayList<Double> listaNotas = new ArrayList<Double>();

    // Construtor
    public Exercicio13 (String nome){
        this.nome = nome;
    }

    // Métodos - criar métodos
    public ArrayList<Double> getListaNotas(){
        return listaNotas;
    }
    public ArrayList<Double> notasAlunos(){
        System.out.println("Digite sua nota:");
        double nota = input.nextDouble();
        listaNotas.add(nota);
        return listaNotas;
    }
    public double calculaMedia(){
        double media = (listaNotas.get(0) * 2 + listaNotas.get(1) * 3 + listaNotas.get(2)  * 3)/10;
        return  media;
    }

    public static void main(String[] args){

        Exercicio13 notas = new Exercicio13("André notas");

        for(int i = 0 ; i < 3; i++){
            notas.notasAlunos();
        }

        double media = notas.calculaMedia();

        System.out.println("Suas notas foram: " + notas.getListaNotas());
        System.out.println("Sua média foi de " + media);
    }
}
