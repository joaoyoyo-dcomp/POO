/*Num minimercado, um quilo de pão custa R$4,50, um litro de leite custa R$5,30 e uma garrafa de vinho custa R$25,00. O minimercado aplica os seguintes descontos
Se o peso do pão for maior ou igual a um quilo, haverá um desconto de 5% no valor total do pão.
A cada três litros de leite, o terceiro litro tem desconto de 10%.
A cada três garrafas de vinho, a terceira sai grátis.
Escreva um programa que receba as seguintes informações sobre uma compra: o peso do pão, a quantidade de litros de leite e a quantidade de garrafas de vinho. O programa deverá escrever na tela a conta da compra. A conta deverá conter o valor de cada item da compra, o valor do desconto do item, se houver, e o valor total da compra. Adicionalmente, se o valor da compra de um tipo de item for zero, nada deverá ser apresentado sobre o item. Similarmente, se o valor de um dado desconto for zero, nada deverá ser apresentado. Por exemplo, se a compra incluir meio quilo de pão e quatro litros de leite, o programa deverá escrever na tela o seguinte texto formatado.
Pão --------------------- R$ 2.25
Leite ------------------- R$ 21.2
Desconto no leite ------- R$-0.53
Valor Total ------------- R$ 22.92
Observe que nada aparece com relação a vinhos, pois não foi comprado nenhum vinho. Observe também que nada aparece com relação ao desconto no pão, pois nesta compra não há desconto sobre o pão.
 */
import java.util.Scanner;
public class Minimercado {
    static final double PrecoPao = 4.50;
    static final double PrecoLeite = 5.30;
    static final double PrecoVinho = 25.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o peso do pão (em kg, ex: 0.5): ");
        double pesoPao = scanner.nextDouble();        
        System.out.print("Digite a quantidade de litros de leite (inteiro): ");
        int qtdLeite = scanner.nextInt();
        System.out.print("Digite a quantidade de garrafas de vinho (inteiro): ");
        int qtdVinho = scanner.nextInt();

        double totalPao = 0.0;
        double descontoPao = 0.0;
        double totalLeite = 0.0;
        double descontoLeite = 0.0;
        double totalVinho = 0.0;
        double descontoVinho = 0.0;

        totalPao = pesoPao * PrecoPao;
        if (pesoPao >= 1.0) {
            descontoPao = totalPao * 0.05; 
        }

        totalLeite = qtdLeite * PrecoLeite;
        int litrosComDesconto = qtdLeite / 3;
        descontoLeite = litrosComDesconto * (PrecoLeite * 0.10); 
        
        totalVinho = qtdVinho * PrecoVinho;
        int vinhosGratis = qtdVinho / 3;
        descontoVinho = vinhosGratis * PrecoVinho; 
        
        double valorTotal = (totalPao - descontoPao) + 
                            (totalLeite - descontoLeite) + 
                            (totalVinho - descontoVinho);
                            
        System.out.println("\n--- Conta Final ---");
        
        String formatoLinha = "%-25s R$ %7.2f\n";

        if (totalPao > 0) {
            System.out.printf(formatoLinha, "Pão", totalPao);
        }
        
        if (descontoPao > 0) {
            System.out.printf(formatoLinha, "Desconto no pão", -descontoPao);
        }

        if (totalLeite > 0) {
            System.out.printf(formatoLinha, "Leite", totalLeite);
        }
        if (descontoLeite > 0) {
            System.out.printf(formatoLinha, "Desconto no leite", -descontoLeite);
        }

        if (totalVinho > 0) {
            System.out.printf(formatoLinha, "Vinho", totalVinho);
        }
        
        if (descontoVinho > 0) {
            System.out.printf(formatoLinha, "Desconto no vinho", -descontoVinho);
        }
        
        System.out.printf(formatoLinha, "Valor Total", valorTotal);
        scanner.close();
    }
}