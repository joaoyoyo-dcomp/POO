/**
 * Modela um Relógio Digital com horas, minutos e segundos.
 * Inclui a funcionalidade de um alarme.
 */
public class relogioDigitalModificado {

    // Atributos do Horário Atual
    private int hora;
    private int minuto;
    private int segundo;

    // --- Atributos do Alarme ---
    private int alarmeHora;
    private int alarmeMinuto;
    private boolean alarmeLigado;
    private boolean alarmeEstaTocando;

    /**
     * Construtor de objetos da classe relogioDigitalModificado
     */
    public relogioDigitalModificado(int horaInicial, int minutoInicial, int segundoInicial) {
        // Inicializa o horário atual
        this.hora = horaInicial;
        this.minuto = minutoInicial;
        this.segundo = segundoInicial;

        // Inicializa o alarme (começa desligado e programado para 00:00)
        this.alarmeHora = 0;
        this.alarmeMinuto = 0;
        this.alarmeLigado = false;
        this.alarmeEstaTocando = false;
    }

    /**
     * Avança o relógio em um segundo
     */
    public void tick() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto = minuto + 1;
        }
        if (minuto == 60) {
            minuto = 0;
            hora = hora + 1;
        }
        if (hora == 24) {
            hora = 0;
        }
        
        verificarAlarme();
    }

    /**
     * Retorna a hora atual formatada como "HH:MM:SS".
     */
    public String mostraHora() {
        String horaFormatada = String.format("%02d:%02d:%02d", hora, minuto, segundo);
        return horaFormatada;
    }

    /**
     * Ajusta a hora atual do relógio.
     */
    public void ajustarHora(int novaHora, int novoMinuto, int novoSegundo) {
        this.hora = novaHora;
        this.minuto = novoMinuto;
        this.segundo = novoSegundo;
    }

    /**
     * Define para qual horário o alarme deve tocar.
     * A hora para o alarme (0-23).
     * O minuto para o alarme (0-59).
     */
    public void definirAlarme(int hora, int minuto) {
        this.alarmeHora = hora;
        this.alarmeMinuto = minuto;
    }

    /**
     * Ativa ou desativa o alarme.
     */
    public void ativarDesativarAlarme() {
        alarmeLigado = !alarmeLigado;
    }

    /**
     * Verifica se o alarme está ligado.
     * return true se o alarme está ativado, false caso contrário.
     */
    public boolean estaLigado() {
        return alarmeLigado;
    }

    /**
     * Método privado para checar se o alarme deve tocar.
     * É chamado automaticamente pelo tick().
     */
    private void verificarAlarme() {
        /** Verifica se o alarme está ligado
         E se a hora atual é igual à hora do alarme
         E se o minuto atual é igual ao minuto do alarme
         E se é o primeiro segundo desse minuto (para não tocar 60x)
        */
        if (alarmeLigado && 
            hora == alarmeHora && 
            minuto == alarmeMinuto){
            
            // "Toca" o alarme
            this.alarmeEstaTocando = true;
        } else {
            this.alarmeEstaTocando = false;
        }
    }
    /**
     * Permite verificar se o alarme está tocando
     * neste exato momento (neste segundo).
     * return true se o alarme disparou agora, false caso contrário.
     */
    public boolean estaTocando() {
        return alarmeEstaTocando;
    }
}