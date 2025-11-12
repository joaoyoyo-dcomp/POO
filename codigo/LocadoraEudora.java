/*A Locadora de Veículos Eudora lançou uma grande promoção esse mês: pagando apenas R$ 90 por diária, o cliente pode alugar um carro de passeio. Para cada diária, o cliente recebe uma cota de quilometragem de 100 km. Cada quilômetro a mais custará uma taxa extra de R$ 12.
Escreva um programa que receba como entrada a quantidade de dias e a quilometragem total rodada por um cliente dessa locadora e exiba o valor total a ser pago com duas casas decimais. */
import java.util.Scanner;

public class LocadoraEudora {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();
        int kmRodados = scanner.nextInt();
        double custoDiarias = dias * 90.0;
        int quotaTotalKm = dias * 100;
        double custoExtraKm = 0;      

        if (kmRodados > quotaTotalKm) {
            int kmExtra = kmRodados - quotaTotalKm;
            custoExtraKm = kmExtra * 12.0;
        }

        double custoTotal = custoDiarias + custoExtraKm;
        String totalFormatado = String.format("%.2f", custoTotal);
        System.out.println("Valor total a pagar: R$ " + totalFormatado);
        
        scanner.close();
    } 
}
