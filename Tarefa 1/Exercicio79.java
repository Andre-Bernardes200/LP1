import java.util.ArrayList;
import java.lang.Math;

public class Exercicio79 {

    // Atributos da classe
    private ArrayList<Double> notas = new ArrayList<Double>();
    private double nota;
    private int quantidadeNotas;

    // Criando o construtor
    public Exercicio79 (int quantidadeNotas){
        this.quantidadeNotas = quantidadeNotas;
    }

    // Criando os métodos
    public ArrayList<Double> pegaNotas() {
        int i = 0;
        while (i < this.quantidadeNotas) {
            nota = (Math.random() * 10);
            notas.add(nota);
            i++;
        }
        return notas;
    }

    public double somaNotas (){
        int i = 0;
        double soma = 0;
        while(i < this.quantidadeNotas){
            soma += notas.get(i);
            i++;
        }
        return soma;
    }
    public double media(){
        double somaNotas = somaNotas();
        double media;
        media = somaNotas/this.quantidadeNotas;
        return media;
    }
    public static void main(String[] args){

        Exercicio79 teste = new Exercicio79(20);

        teste.pegaNotas();
        teste.somaNotas();

        System.out.println("""
                A média é %.2f
                """.formatted(teste.media()));
    }
}
