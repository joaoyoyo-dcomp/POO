public class Produto {
    String nome;
    double precoUnitario;
    int quantidade;

    public Produto(String nome, double precoUnitario, int quantidade){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal(){
        return precoUnitario*quantidade;
    }
    public double AplicarDesconto(double percentual){
        double desconto = 1 - (percentual/100);
        return precoUnitario*desconto;
    }
}
