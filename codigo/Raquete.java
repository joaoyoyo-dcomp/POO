/**
 * Modela uma Raquete (paddle) do jogo Pong.
 * A raquete tem posição, tamanho e uma velocidade vertical.
 * Ela sabe como se mover (atualizar) e como responder
 * aos comandos do jogador (mover para cima, para baixo ou parar).
 *
 * @author João Guilherme de Aragão
 * @version (Atividade 5/B)
 */
public class Raquete {
    
    /** Posição horizontal (coordenada X). Geralmente é fixa. */
    private double posX;
    
    /** Posição vertical (coordenada Y) do topo da raquete. */
    private double posY;

    /** A velocidade vertical atual da raquete (pixels por segundo). */
    private double velY;
    
    /** A largura da raquete. */
    private double largura;
    
    /** A altura (comprimento) da raquete. */
    private double altura;
    
    /** A velocidade máxima que a raquete pode atingir (constante). */
    private final double VELOCIDADE_MAXIMA = 300; 

    /**
     * Construtor de objetos da classe Raquete.
     * @param xInicial A posição X (geralmente fixa).
     * @param yInicial A posição Y inicial.
     * @param largura A largura da raquete.
     * @param altura A altura (comprimento) da raquete.
     */
    public Raquete(double xInicial, double yInicial, double largura, double altura) {
        this.posX = xInicial;
        this.posY = yInicial;
        this.largura = largura;
        this.altura = altura;
        this.velY = 0; 
    }

    /**
     * Método principal da dinâmica.
     * Atualiza a posição Y da raquete com base em sua velocidade
     * e no tempo 't' que se passou.
     *
     * @param tempoT O tempo transcorrido (delta time) em segundos.
     */
    public void atualizar(double tempoT) {
        // A nova posição é a posição antiga + (velocidade * tempo)
        this.posY = this.posY + (this.velY * tempoT);
    }

    /**
     * Define a velocidade da raquete para se mover para CIMA.
     * (Em computação gráfica, "cima" é um Y negativo).
     */
    public void moverParaCima() {
        this.velY = -VELOCIDADE_MAXIMA;
    }

    /**
     * Define a velocidade da raquete para se mover para BAIXO.
     * (Em computação gráfica, "baixo" é um Y positivo).
     */
    public void moverParaBaixo() {
        this.velY = VELOCIDADE_MAXIMA;
    }

    /**
     * Para a raquete, definindo sua velocidade como zero.
     * (Usado quando o jogador solta a tecla).
     */
    public void parar() {
        this.velY = 0;
    }

    /** @return A posição X atual. */
    public double getPosX() {
        return this.posX;
    }

    /** @return A posição Y atual. */
    public double getPosY() {
        return this.posY;
    }
    
    /** @return A largura da raquete. */
    public double getLargura() {
        return this.largura;
    }
    
    /** @return A altura da raquete. */
    public double getAltura() {
        return this.altura;
    }
}