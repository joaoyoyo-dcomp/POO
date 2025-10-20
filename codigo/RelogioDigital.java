
/**
 * Modela um Relógio Digital simples, capaz de marcar horas e minutos.
 * A classe permite que o tempo avance (com o método tick) e 
 * que a hora seja exibida.
 *
 * @author João Guilherme de Aragão
 * @version 1.0 (Atividade 3)
 */
public class RelogioDigital 
{
    private int hora;
    private int minuto;

    /**
     * Construtor para objetos da classe RelogioDigital.
     * Inicializa o relógio com o horário a ser definido.
     * @param horaInicial A hora em que o relógio deve começar (0-23).
     * @param minutoInicial O minuto em que o relógio deve começar (0-59).
     */
    public RelogioDigital(int horaInicial, int minutoInicial)
    {
        // inicializa variáveis de instância com valores fornecidos
        this.hora = horaInicial;
        this.minuto = minutoInicial;
    }

    /**
     * Avança o tempo do relógio em um minuto.
     * Este método é o "coração" do relógio e cuida da lógica
     * de virar os minutos para horas e as horas para o próximo dia (00:00).
     */
    public void tick()
    {
        minuto++; // Avança um minuto
        
        if (minuto == 60) {
            // Se o minuto chega a 60, zera os minutos e avança uma hora
            minuto = 0;
            hora = hora + 1;
        }
        
        if (hora == 24) {
            // Se a hora chega a 24, zera para representar a meia-noite
            hora = 0;
        }
    }

    /**
     * Retorna a hora atual formatada como uma String.
    */
    public String mostraHora(){
        String horaFormatada = String.format("%02d:%02d", hora, minuto);
        return horaFormatada;
    }
}