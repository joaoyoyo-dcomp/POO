
/**
 * Modela um circuito de interruptores paralelos (three-way).
 * Esta classe representa UMA lâmpada que é controlada
 * por DOIS interruptores.
 */
public class interruptoresParalelos
{
    // Este atributo representa o estado da LÂMPADA
    private boolean lampadaLigada;

    /**
     * Construtor de objetos da classe interruptoresParalelos
     * A lâmpada sempre começa desligada.
     */
    public interruptoresParalelos()
    {
        // inicializa a variável de instância
        lampadaLigada = false;
    }

    /**
     * Simula o clique no primeiro interruptor.
     * Independentemente do estado atual, ele inverte
     * o estado da lâmpada.
     */
    public void apertarInterruptor1()
    {
        // Inverte o estado da lâmpada
        lampadaLigada = !lampadaLigada;
    }
    
    /**
     * Simula o clique no segundo interruptor.
     * Independentemente do estado atual, ele inverte
     * o estado da lâmpada.
     */
    public void apertarInterruptor2()
    {
        // Inverte o estado da lâmpada
        lampadaLigada = !lampadaLigada;
    }

    /**
     * Verifica se a lâmpada está ligada ou não.
     * @return true se a lâmpada está ligada, false caso contrário.
     */
    public boolean estaLigada()
    {
        return lampadaLigada;
    }
}