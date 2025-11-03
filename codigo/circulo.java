public class circulo{
    double pi = 3.14;
    double raio;
    public circulo(double raio){
        this.raio = raio;
    }
    public double CalcularArea(){
        return pi*raio*raio;
    }
    public double calcularPerimetro(){
        return 2*pi*raio;
    }
}