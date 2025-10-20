
/**
 * Escreva uma descrição da classe banco aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class banco
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String cpfdoCliente;
    private double saldo;

    /**
     * Construtor para objetos da classe banco
     */
    public banco(String cpf, double saldoInicial)
    {
        // inicializa variáveis de instância
        this.cpfdoCliente = cpf;
        this.saldo = saldoInicial;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public void depositar(double novoDinheiro){
    if (novoDinheiro > 0){
    this.saldo = this.saldo + novoDinheiro;
    }
    }
    public boolean sacar(double novoDinheiro){
    if (novoDinheiro > 0 && this.saldo >= novoDinheiro){
        this.saldo = this.saldo - novoDinheiro;
        return true;
    }
    else {
        return false;
    }
    }
    public double verSaldo(){
        return this.saldo;
    }
}