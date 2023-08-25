package br.com.modelos;

public class RelogioDigital {

    // Atributos
    private String marca;
    private boolean horas;
    private String aplicativo;

    // Construtor
    public RelogioDigital (String marca){
        this.marca = marca;
    }

    // Métodos
    public void mostrarHoras (boolean horas){
        if(horas){
            System.out.println("Agora são 02:00 da manhã, hora de dormir");
        }else{
            System.out.println("Hora de trabalhar :(");
        }
    }
    public String usarApp (String aplicativo){
        return "Você vai usar o " + aplicativo;
    }

    public void trocarRelogio(){
        System.out.println("Hora de trocar de relógio...");
    }

}
