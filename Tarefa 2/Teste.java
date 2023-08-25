import br.com.modelos.Celular;
import br.com.modelos.Notebook;
import br.com.modelos.ArCondicionado;
import br.com.modelos.RelogioDigital;
import br.com.modelos.Carro;
import br.com.modelos.Calculadora;
import br.com.modelos.VideoGame;
import br.com.modelos.CaixaSom;
import br.com.modelos.Aviao;
import br.com.modelos.Televisao;

public class Teste {
    public static void main(String[] args){

        Celular celular = new Celular("Iphone SE","Apple",2020);

        System.out.println(celular.getModelo());
        celular.setModelo("Iphone 14 pro");
        System.out.println(celular.getModelo());
        celular.ligar(true);

        Notebook note = new Notebook("Lenovo","Desconhecido",2018);
        System.out.println("\n");

        System.out.println(note.getDados());
        note.autoDestruir(true);
        System.out.println("\n");

        ArCondicionado arCond = new ArCondicionado("Pingu");

        System.out.println("O nome do ar é " + arCond.getNome());
        System.out.println("Passou a ser " + arCond.setNome("Pingu o pinguim"));
        System.out.println(arCond.ligar(true));
        arCond.gelar(true);
        System.out.println("\n");

        RelogioDigital relogio = new RelogioDigital("Xiaomi");
        relogio.mostrarHoras(false);
        System.out.println(relogio.usarApp("Músicas"));
        relogio.trocarRelogio();
        System.out.println("\n");

        Carro carro = new Carro("Chevrolet");

        System.out.println("Você tem o carro da " + carro.getMarca());
        carro.horaDeBater(150);
        carro.venderCarro(true);
        System.out.println("\n");

        Calculadora calc = new Calculadora(10,542.05);

        System.out.println("""
                A soma deu: %.2f
                A divisão deu: %.2f
                A multiplicação deu: %.2f
                \n""".formatted(calc.somar(),calc.dividir(),calc.multiplicar()));

        VideoGame console = new VideoGame("Sony","PS5","Preto");
        console.dados();
        console.setCor("Azul marinho");
        console.dados();
        System.out.println(console.jogar(true));
        System.out.println("\n");

        CaixaSom som = new CaixaSom("JBL Extreme","JBL","Prata");
        som.getDados();
        som.tocarMusica(true);
        System.out.println("\n");

        Aviao aviao = new Aviao("Embraer","Caçador");
        System.out.println(aviao.getDados());
        aviao.Decolar(true);
        aviao.usoComercial(false);
        System.out.println("\n");

        Televisao tv = new Televisao("Samsung");
        System.out.println(tv.getMarca());
        tv.ligar(true);
        System.out.println(tv.streaming(true));


    }
}
