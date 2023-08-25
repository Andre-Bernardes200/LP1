public class Exercicio12 {

    //Declarado atributo
    private double grausCelsius;

    // Construtor
    public Exercicio12 (double grausCelsius){
        this.grausCelsius = grausCelsius;
    }

    //Criando método getter e setter

    public double getGrausCelsius(){
        return this.grausCelsius;
    }
    public double setGrausCelsius (double grausCelsius){
        return this.grausCelsius = grausCelsius;
    }

    // Criando método para converter graus celsius em fahrenheit.
    public double transformaGrausFahren(){
        return (this.grausCelsius / 5 ) * 9 +32;
    }

    public static void main(String [] args){
        Exercicio12 temp = new Exercicio12(100);

        System.out.println(temp.getGrausCelsius());

        System.out.println("A temperatura de " + temp.getGrausCelsius() + "Cº para fahrenheit é " + temp.transformaGrausFahren());

    }
}
