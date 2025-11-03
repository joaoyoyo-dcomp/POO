public class Main {
    public static void main(String[] args){
        circulo circulo1 = new circulo(5);
        double area = circulo1.CalcularArea();
        double perimetro = circulo1.calcularPerimetro();
        System.out.println("A area do circulo eh " + area);
        System.out.println("O perimetro do circulo eh "+ perimetro);
    }
}
