package br.com.modelos;

public class VideoGame {
    // Atributos
    private String marca;
    private String modelo;
    private String cor;
    private boolean ligar;

    // Construtor
    public VideoGame(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Métodos

    public void dados(){
        System.out.println("Você tem o video game da " + this.marca + " que é o " + this.modelo + " " + this.cor);
    }

    public String setCor(String cor){
        return this.cor = cor;
    }

    public String jogar(boolean ligar){
        if(ligar){
            return "Você vai jogar";
        }else{
            return "Ishi, não deu tempo hoje.";
        }
    }
}
