/**
 * Modela a Bola do jogo Pong.
 * A bola tem uma posição, uma velocidade e um tamanho.
 * Ela sabe como se mover (atualizar sua posição) e
 * como reagir a colisões (inverter sua velocidade).
 *
 * @author João Guilherme de Aragão
 * @version (Atividade 5/A)
 */
public class Bola {
    
    /** Posição horizontal (coordenada X) da bola. */
    private double posX;
    
    /** Posição vertical (coordenada Y) da bola. */
    private double posY;

    /** Velocidade da bola no eixo X (pixels por segundo). */
    private double velX;
    
    /** Velocidade da bola no eixo Y (pixels por segundo). */
    private double velY;
    
    /** O raio (tamanho) da bola. */
    private double raio;

    /**
     * Construtor de objetos da classe Bola.
     * @param xInicial A posição X inicial.
     * @param yInicial A posição Y inicial.
     * @param vXInicial A velocidade X inicial.
     * @param vYInicial A velocidade Y inicial.
     * @param raio O tamanho (raio) da bola.
     */
    public Bola(double xInicial, double yInicial, double vXInicial, double vYInicial, double raio) {
        this.posX = xInicial;
        this.posY = yInicial;
        this.velX = vXInicial;
        this.velY = vYInicial;
        this.raio = raio;
    }

    /**
     * Método principal da dinâmica.
     * Atualiza a posição da bola com base em sua velocidade
     * e no tempo 't' que se passou desde a última atualização.
     *
     * @param tempoT O tempo transcorrido (delta time) em segundos.
     */
    public void atualizar(double tempoT) {

        this.posX = this.posX + (this.velX * tempoT);
        this.posY = this.posY + (this.velY * tempoT);
    }

    /**
     * Inverte a velocidade da bola no eixo X.
     * (Usado quando a bola bate em uma raquete ou parede lateral).
     */
    public void inverterVelocidadeX() {
        this.velX = -this.velX;
    }

    /**
     * Inverte a velocidade da bola no eixo Y.
     * (Usado quando a bola bate no teto ou no chão).
     */
    public void inverterVelocidadeY() {
        this.velY = -this.velY;
    }

    /**
     * Reposiciona a bola no centro da tela (usado após um ponto).
     * @param x A nova posição X.
     * @param y A nova posição Y.
     */
    public void resetarPosicao(double x, double y) {
        this.posX = x;
        this.posY = y;
    }
    

    /** @return A posição X atual. */
    public double getPosX() {
        return this.posX;
    }

    /** @return A posição Y atual. */
    public double getPosY() {
        return this.posY;
    }
    
    /** @return O raio (tamanho) da bola. */
    public double getRaio() {
        return this.raio;
    }
}