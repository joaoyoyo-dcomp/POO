/**
 * Modela uma Conta Bancária simples para o projeto "banco".
 * A conta armazena o CPF do cliente, o saldo, e permite
 * as operações de depositar, sacar e verificar o saldo.
 *
 * @author João Guilherme de Aragão
 * @version 1.0 (Atividade 1)
 */
public class ContaBancaria 
{
    // variáveis de instância
    private String cpfdoCliente;
    private double saldo;

    /**
     * Construtor para objetos da classe ContaBancaria.
     * @param cpf O CPF do cliente dono da conta.
     * @param saldoInicial O saldo inicial ao criar a conta.
     */

    public ContaBancaria(String cpf, double saldoInicial)
    {
        // inicializa variáveis de instância
        this.cpfdoCliente = cpf;
        this.saldo = saldoInicial;
    }

    /**
     * Adiciona um valor ao saldo da conta.
     * O valor do depósito deve ser positivo.
     *
     * @param novoDinheiro O valor a ser depositado.
     */
    public void depositar(double novoDinheiro){
        if (novoDinheiro > 0){
            this.saldo = this.saldo + novoDinheiro;
        }
    }

    /**
     * Retira um valor do saldo da conta.
     * O saque só é realizado se o valor for positivo
     * e se houver saldo suficiente na conta.
     *
     * @param novoDinheiro O valor a ser sacado.
     * @return true se o saque foi bem-sucedido, false caso contrário.
     */
    public boolean sacar(double novoDinheiro){
        if (novoDinheiro > 0 && this.saldo >= novoDinheiro){
            this.saldo = this.saldo - novoDinheiro;
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Retorna o saldo atual da conta.
     *
     * @return O valor do saldo atual.
     */
    public double verSaldo(){
        return this.saldo;
    }
}