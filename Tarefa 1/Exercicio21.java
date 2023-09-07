public class Exercicio21 {

    // Criando atributos
    private int horaInicio;
    private int horaFim;
    private int diasPartida;
    private int horasPartida;

    // Criando o construtor
    public Exercicio21(int horaInicio, int horaFim){
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    // Criando métodos
    private int quantidadeHoras(){
        horasPartida = horaFim - horaInicio;
        return horasPartida;
    }

    public int quantidadeHorasPartida(){
        if(quantidadeHoras() < 0){
            return +quantidadeHoras() + 24;
        }else{
            return  quantidadeHoras();
        }
    }

    public static void main(String[] args){
        Exercicio21 partida = new Exercicio21(14,9);
        if(partida.quantidadeHorasPartida() == 24){
            System.out.print("""
                    A partida durou %d horas e como cada partida tem no máximo 24h.
                    """.formatted(partida.quantidadeHorasPartida()));
        }else{
            System.out.println("""
                    A partida durou %d horas e não chegou no tempo máximo.
                    """.formatted(partida.quantidadeHorasPartida()));
        }
    }

}
