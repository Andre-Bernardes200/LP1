package br.com.modelos;

public class CaixaSom {

    // Atributos
    private String modelo;
    private String marca;
    private String cor;
    private boolean liga;

    // Construtor
    public CaixaSom(String modelo, String marca, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    // Métodos
    public void getDados(){
        System.out.println("Caixa de som da " + this.marca + ", modelo " + this.modelo + " " + this.cor);
    }
    public void tocarMusica(boolean liga){
        if(liga){
            System.out.println("Hora de acordar os vizinhos");
        }else{
            System.out.println("Estou bonzinho, não vou ligar a caixa de som");
        }
    }
    public void desligar(){
        System.out.println("Hora de desligar");
    }
}
