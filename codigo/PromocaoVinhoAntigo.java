import java.util.Scanner;

/**
 * Exercício 6: Promoção de Vinhos
 * @author João Guilherme de Aragão
 * Lê a quantidade total e o preço e calcula o total a pagar com a regra "pague 2, leve 3".
 */
public class PromocaoVinhoAntigo {

    public static void main(String[] args) {
        
        // 1. Cria o Scanner
        var leitor = new Scanner(System.in);
        
        System.out.println("--- Promoção de Vinhos: Pague 2, Leve 3 ---");
        
        // 2. Ler a quantidade de garrafas
        System.out.print("Quantas garrafas você vai levar no total? ");
        var entradaQtd = leitor.nextLine();
        var quantidadeComprada = Integer.parseInt(entradaQtd);
        
        // 3. Ler o preço individual
        System.out.print("Qual o preço individual de cada garrafa? R$ ");
        var entradaPreco = leitor.nextLine();
        var precoIndividual = Double.parseDouble(entradaPreco);
        
        // 4. Lógica da Promoção
        // (Quantidade de grupos de 3) * 2 garrafas pagas
        var garrafasPagasDosGrupos = (quantidadeComprada / 3) * 2;
        // Garrafas que sobraram (0, 1 ou 2)
        var garrafasPagasSobrantes = quantidadeComprada % 3;
        
        var quantidadeAPagar = garrafasPagasDosGrupos + garrafasPagasSobrantes;
        
        // 5. Cálculo do preço final
        var valorTotal = quantidadeAPagar * precoIndividual;
        
        // 6. Apresentar resultado
        System.out.println("----------------------------------------------");
        System.out.println("Total de garrafas levadas: " + quantidadeComprada);
        System.out.println("Total de garrafas a pagar: " + quantidadeAPagar);
        
        var valorFormatado = String.format("%.2f", valorTotal);
        System.out.println("Valor total a pagar: R$ " + valorFormatado);
        
        // 7. Fecha o Scanner
        leitor.close();
    }
}
