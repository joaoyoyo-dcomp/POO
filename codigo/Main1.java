public class Main1 {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Joao", 61.0, 1.70);
        double imc = pessoa1.calcularIMC();
        System.out.println("O IMC de " + pessoa1.nome + " eh: " + imc);
        Pessoa pessoa2 = new Pessoa("Cara", 75.0, 1.75);
        System.out.println("O IMC de " + pessoa2.nome + " eh: " + pessoa2.calcularIMC());
    }
}

