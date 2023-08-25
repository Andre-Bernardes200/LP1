package br.com.modelos;

public class Celular {

    // fazendo atributos.
    private String modelo;
    private String marca;
    private int ano;
    private boolean ligando;

    // Construtor
    public Celular(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ligando = ligando;
    }

    // Métodos

    public String getModelo(){
        return this.modelo;
    }
    public String setModelo (String modelo){
        return this.modelo = modelo;
    }
    public void ligar (boolean ligando ){
        if(ligando == true){
            System.out.println("Você está ligando para fulaninho");
        }else{
            System.out.println("Você não está ligando para ninguém");
        }

    }
}


