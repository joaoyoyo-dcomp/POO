public class ContaBancaria {
    String pessoa;
    String conta;
    double saldo;

    public ContaBancaria(String pessoa, String conta, double saldo){
        this.pessoa = pessoa;
        this.conta = conta;
        this.saldo = saldo;
    }
    public void Depositar(double valor){
        if (valor > 0) {this.saldo = saldo + valor;}
    }
    public void Sacar(double valor){
        if (this.saldo > valor) {this.saldo = saldo - valor;}
    }
    public double consultarSaldo(){
        return this.saldo;
    }
}
