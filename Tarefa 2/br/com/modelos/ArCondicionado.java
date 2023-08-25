package br.com.modelos;

public class ArCondicionado {

    // Atributos

    private String nome;
    private boolean ligando;
    private boolean gelando;

    // Construtor
    public ArCondicionado(String nome){
        this.nome = nome;
    }

    // Métodos
    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome){
        return this.nome = nome;
    }

    public String ligar (boolean ligando){
        if(ligando){
            return "Você está ligando...";
        }else{
            return "Está frio, não precisa ligar";
        }
    }
    public void gelar(boolean gelando){
        if(gelando){
            System.out.println("Ta quente para burro, bota para gelar");
        }else{
            System.out.println("Vou passar calor");
        }
    }

}
