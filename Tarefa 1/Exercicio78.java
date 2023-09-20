import java.util.Arrays;
import java.util.Scanner;

public class Exercicio78 {

    // Atributos da classe
    private String[] nomes = new String[10];
    private String nome;
    private Scanner input = new Scanner(System.in);

    // Método para adicionar nomes
    public String[] adicionaNomes(){
        for(int i = 0; i < 10; i++){
            System.out.print("Qual o nome que deseja adicionar: ");
            nomes[i] = input.nextLine();
        }
    return nomes;
    }

    // Método para perguntar qual nome deseja procurar
    public String perguntaNome(){
        System.out.print("Qual nome deseja procurar: ");
        nome = input.nextLine();
        return nome;
    }

    // Método para comparar nome
    public boolean comparaNome(String nome){
        int num;
        for(num = 0; num < 0; num++){
            if(nome.equalsIgnoreCase(nomes[num])){
                break;
            }
        }
        return nome.equalsIgnoreCase(nomes[num]);

    }

    public static void main(String[] args){

        Exercicio78 testeNome = new Exercicio78();

        testeNome.adicionaNomes();
        String nome = testeNome.perguntaNome();
        boolean compara = testeNome.comparaNome(nome);

        if(compara){
            System.out.println("O nome digitado está na lista");
        }else{
            System.out.print("O nome digitado não está na lista");
        }

    }
}
