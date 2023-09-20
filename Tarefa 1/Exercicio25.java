public class Exercicio25 {

    // Atributos
    private double saldo;
    private double debito;
    private double credito;
    private int conta;

    // Construtor
    public Exercicio25 (int conta,double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }

    // Métodos

    private boolean temSaldo(){
        if(this.saldo > 0){
            return true;
        }else{
            return false;
        }
    }
    public double valorSaldo(double debito,double credito){
        saldo += credito - debito;
        return this.saldo;
    }
    public static void main(String[] args){
        Exercicio25 valorSaldo = new Exercicio25(123456,1500);
        double saldo = valorSaldo.valorSaldo(200,500);

        System.out.println("Você tem R$ " + saldo);
    }
}
