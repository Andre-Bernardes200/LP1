package br.com.modelos;

public class Carro {

    // Atributos
    private String marca;
    private double velocidade;
    private boolean venda;

    // Construtor
    public Carro (String marca){
        this.marca = marca;
    }

    // Métodos

    public String getMarca(){
        return this.marca;
    }

    public void horaDeBater(double velocidade){
        if(velocidade >= 120){
            System.out.println("Hora de dar PT no carro, fazer loucuras");
        }else{
            System.out.println("Você está sendo responsável");
        }
    }
    public void venderCarro(boolean venda){
        if(venda){
            System.out.println("Hora de evoluir");
        }else{
            System.out.println("Ser pobre é triste, só queria trocar de carro");
        }
    }
}
