package br.com.modelos;

public class Notebook {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligando;
    private boolean destruir;

    // Construtor
    public Notebook(String marca,String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos
    public String getDados(){
        return "Seu notebook é da marca " + this.marca + " do ano " + this.ano;
    }

    public void ligarNote(boolean ligar){
        if(ligar){
            System.out.println("Ligando antes de dar tela azul.");
        }else{
            System.out.println("Vishiiiii!!!\nDeu tela azul");
        }
    }

    public void autoDestruir(boolean destruir){
        if(destruir){
            System.out.println("Auto destruindo em 10,9,8,...");
        }else{
            System.out.println("Auto destruição abortado");
        }
    }


}