package br.com.modelos;

public class Aviao {

    // Atributos
    private String fabricante;
    private String modelo;
    private boolean voar;
    private boolean motivo;

    // Construtor
    public Aviao(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    // Métodos
    public String getDados() {
        return "Avião da " + this.fabricante + " modelo " + this.modelo;
    }

    public void Decolar(boolean voar) {
        if (voar) {
            System.out.println("Segura as pontas que vamos decolar");
        } else {
            System.out.println("Vamos ficar no chão");
        }
    }
    public void usoComercial(boolean motivo){
        if (motivo){
            System.out.println("Vamos para Maldivas");
        }else{
            System.out.println("Vamos para a guerra");
        }
    }
}
