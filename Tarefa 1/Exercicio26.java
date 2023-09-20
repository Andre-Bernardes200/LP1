import java.util.Scanner;

public class Exercicio26 {

    // Atributos
    private int maximoEstoque;
    private int minimoEstoque;
    private int quantidadeMedia;
    private int quantidadeEstoque;

    // Construtor
    public Exercicio26(){
        this.maximoEstoque = maximoEstoque;
        this.minimoEstoque = minimoEstoque;
        this.quantidadeMedia = quantidadeMedia;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos
    private int quantidadeMediaEstoque(int maximoEstoque, int minimoEstoque){
        quantidadeMedia = (this.maximoEstoque + this.minimoEstoque)/2;
        return this.quantidadeMedia;
    }
    public void efetuarCompra(int quantidadeEstoque, int maximoEstoque, int minimoEstoque){
        if(this.quantidadeEstoque > quantidadeMediaEstoque(maximoEstoque,minimoEstoque)){
            System.out.println("Não precisa comprar material");
        }else{
            System.out.println("Precisa comprar material");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Exercicio26 estoque = new Exercicio26();

        int maximo;
        int minimo;
        int atual;

        System.out.print("Qual sua quantidade de estoque atual: ");
        atual = input.nextInt();
        System.out.print("Agora a sua quantidae máxima: ");
        maximo = input.nextInt();
        System.out.print("Agora sua quantidade minima: ");
        minimo = input.nextInt();

        estoque.efetuarCompra(atual,maximo,minimo);

    }
}
