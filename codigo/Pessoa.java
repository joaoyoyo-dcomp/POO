public class Pessoa {
    String nome;
    Double peso;
    Double altura;

    public Pessoa(String nome, Double peso, Double altura){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC(){
        return peso/(altura*altura);
    }
}
