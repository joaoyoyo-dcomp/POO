public class Main2 {
    public static void main(String[] args){
        Produto p1 = new Produto("Carne", 60.0, 5);
        double valor = p1.calcularValorTotal();
        System.out.println("O valor total de " + p1.nome + " eh: " +valor);
        System.out.println("O desconto em " + p1.nome + " eh: " +p1.AplicarDesconto(0.5));
    }
}
