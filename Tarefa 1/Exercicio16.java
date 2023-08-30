public class Exercicio16 {

    // Declarando atributos
    private int appleAmount;
    private int applesCostMore12 = 1;
    private double applesCostAnyLess = 1.3;

    // Criando construtor
    public Exercicio16(int appleMount){
        this.appleAmount = appleMount;
    }

    // Criando métodos
    public int getAppleAmount(){
        return  appleAmount;
    }
    public int getApplesCostMore12(){
        return applesCostMore12;
    }
    public double getApplesCostAnyLess(){
        return applesCostAnyLess;
    }

    public double finalCost(){
      if(appleAmount >= 12){
          double applesCost = appleAmount * applesCostMore12;
          return  applesCost;
      }else{
          double applesCost = appleAmount * applesCostAnyLess;
          return  applesCost;
      }
    };

    public static void main (String[] args){
        Exercicio16 costApples = new Exercicio16(12);

        System.out.println("""
                *****************************************
                Se comprar pelo menos 12 maças cada uma custa: 1,00
                Se comprar menos de uma dúzia custa: 1,30
                """.formatted(costApples.getApplesCostAnyLess(), costApples.getApplesCostMore12()));

        System.out.println("""
                Você comprou %d e pagou R$ %.2f
                """.formatted(costApples.getAppleAmount(),costApples.finalCost()));

    }
}
