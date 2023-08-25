package br.com.modelos;

public class Calculadora {

    // Atributos
    private double numero1;
    private double numero2;

    // Construtor
        public Calculadora (double numero1,double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Métodos
    public double somar(){
            return this.numero1 + this.numero2;
    }
    public double dividir(){
            return this.numero1 / this.numero2;
    }
    public double multiplicar(){
            return this.numero1 * this.numero2;
    }
}
