import java.util.ArrayList;

public class Exercicio85 {

    //Atributos
    private ArrayList<Double> temperaturas = new ArrayList<>();

    // Métodos

    public Exercicio85 (){
        while(temperaturas.size() < 365) {
            double temp = (Math.random() * 100);
            if (temp > 20 && temp < 40) {
                temperaturas.add(temp);
            }
        }
    }

    public double maiorTemp(){
        double maior = temperaturas.get(0);
        for(double temp : temperaturas){
            if(temp >= maior){
                maior = temp;
            }
        }
        return maior;
    }
    public double menorTemp(){
        double menor = temperaturas.get(0);
        for(double temp: temperaturas){
            if(temp <= menor){
                menor = temp;
            }
        }
        return menor;
    }

    public double mediaAnual(){
        double soma = 0;
        for( double temp : temperaturas){
            soma += temp;
        }
        double media = soma/temperaturas.size();
        return  media;
    }

    public int diasMenorAnual(){
        int dias = 0;
        int i = 0;
        while (i < temperaturas.size()){
            if(temperaturas.get(i) < mediaAnual()){
                dias +=1;
            }
            i+= 1;
        }
        return dias;
    }

    public static  void main(String[] args){
        Exercicio85 temp = new Exercicio85();

        System.out.println("""
                a) Menor temperatura: %.2f
                """.formatted(temp.menorTemp()));
        System.out.println("""
                b) Maior temperatura: %.2f
                """.formatted(temp.maiorTemp()));
        System.out.println("""
                c) Média anual de temperatura: %.2f
                """.formatted(temp.mediaAnual()));
        System.out.println("""
                d) Dias em que foi menor que a média: %d
                """.formatted(temp.diasMenorAnual()));

    }
}
