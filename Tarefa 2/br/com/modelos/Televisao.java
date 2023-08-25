package br.com.modelos;
import java.util.Scanner;

public class Televisao {

    // Atributos
    private String marca;
    private boolean ligada;
    private boolean smartTv;

    // Construtor
    public Televisao(String marca){
        this.marca = marca;
    }

    // Métodos
    public String getMarca(){
        return this.marca;
    }
    public void ligar(boolean ligada) {
        if(ligada){
            System.out.println("Vamos ver algo para assistir");
        }else{
            System.out.println("Cansei, vou dormir");
        }
    }
    public String streaming(boolean smartTv){
        if (smartTv){
            Scanner input = new Scanner(System.in);
            System.out.println("O que deseja assistir: ");
            String programa = input.next();
            return "Você vai assistir " + programa;
        }else{
            return "Você não tem Smart TV, precisa se atualizar";
        }
    }

}
