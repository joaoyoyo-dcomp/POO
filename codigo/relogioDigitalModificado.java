/**
 * Modela um Relógio Digital com horas, minutos e segundos.
 * Inclui a funcionalidade de um alarme.
 * @author João Guilherme de Aragão
 * @version 1.0 (Atividade 4)
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
        // Primeiro, checa se os dados são VÁLIDOS
        if ((0 <= horaInicial && horaInicial <= 23) &&
            (0 <= minutoInicial && minutoInicial <= 59) &&
            (0 <= segundoInicial && segundoInicial <= 59)) {
            
            // Caso de SUCESSO: Atribui os valores recebidos
            this.hora = horaInicial;
            this.minuto = minutoInicial;
            this.segundo = segundoInicial;
            
        } else {
            
            // Caso de ERRO: Atribui o padrão seguro (00:00:00)
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
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
/**
     * Ajusta a hora atual do relógio, usando a lógica de validação
     * demonstrada pelo seu professor.
     * Valida os dados antes de alterar.
     */
    public void ajustarHora(int novaHora, int novoMinuto, int novoSegundo) {
        
        boolean horaValida = (0 <= novaHora && novaHora <= 23);
        boolean minutoValido = (0 <= novoMinuto && novoMinuto <= 59);
        boolean segundoValido = (0 <= novoSegundo && novoSegundo <= 59);

        if (horaValida && minutoValido && segundoValido) {
            
            this.hora = novaHora;
            this.minuto = novoMinuto;
            this.segundo = novoSegundo;
            
        } else {System.out.printf("Dados incorretos");}}

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