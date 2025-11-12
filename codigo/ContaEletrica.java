/*
 * Numa cidade o valor da kWh de energia varia da forma mostrada abaixo.
Até 99 KWh: R$1.35
100 até 299 KWh: R$1.55
300 até 574 KWh: R$1.75
Maior ou igual a 575 KWh: R$2.15
Esta tabela de preços é progressiva. Isto quer dizer que, por exemplo, se o consumo for 150 kWh, então deste total de kWh, para os primeiros 99 kWh usa-se a tarifa de R$1,35 por kWh e para os restantes 51 kWh usa-se a tarifa de R$1,55.
Adicionalmente, quando o consumo é maior que 300 kWh, é cobrada uma taxa de 10% no valor da conta e o preço mínimo de qualquer conta é R$35. Escreva um programa para calcular o valor de uma conta elétrica.
 */
import java.util.Scanner;

public class ContaEletrica {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int consumo = scanner.nextInt();
        double valorAPagar = calcularConta(consumo);
        String totalFormatado = String.format("%.2f", valorAPagar);
        System.out.println("Valor total a pagar: R$ " + totalFormatado);
         scanner.close();
    } 
    
    static double calcularConta(int consumo) {
        
        double custoBase = 0.0;
        int consumoOriginal = consumo;
        int Nivel_3 = 574;
        int Nivel_2 = 299;
        int Nivel_1 = 99; 
        
        double Tarifa4 = 2.15; 
        double Tarifa3 = 1.75; 
        double Tarifa2 = 1.55; 
        double Tarifa1 = 1.35;

        if (consumo > Nivel_3) {
            int kwhNestaFaixa = consumo - Nivel_3;
            custoBase += kwhNestaFaixa * Tarifa4;
            consumo = Nivel_3;
        }


        if (consumo > Nivel_2) {
            int kwhNestaFaixa = consumo - Nivel_2;
            custoBase += kwhNestaFaixa * Tarifa3;
            consumo = Nivel_2;
        }

        if (consumo > Nivel_1) {
            int kwhNestaFaixa = consumo - Nivel_1;
            custoBase += kwhNestaFaixa * Tarifa2;
            consumo = Nivel_1; 
        }
        custoBase += consumo * Tarifa1;
        
        double custoFinal = custoBase;
        if (consumoOriginal > 300) {
            custoFinal = custoBase * 1.10;
        }
        if (custoFinal < 35.0) {
            custoFinal = 35.0;
        }

        return custoFinal;
    }
}