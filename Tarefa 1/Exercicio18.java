public class Exercicio18 {

    // Atributos
    private int anoAtual;
    private int anoNascimento;

    // Construtor
    public Exercicio18(int anoAtual, int anoNascimento){
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
    }

    // Métodos

    public int getAnoNascimento(){
        return  this.anoNascimento;
    }
    public int getAnoAtual(){
        return this.anoAtual;
    }
    public void podeVotar(){
        int idade = anoAtual - anoNascimento;
        if(idade >= 60){
            System.out.println("Você pode votar");
        }else{
            System.out.println("Você não pode votar");
        }
    }
    public static void main(String[] args){
        Exercicio18 minhaIdade = new Exercicio18(2023,1954);
        minhaIdade.podeVotar();
    }
}
