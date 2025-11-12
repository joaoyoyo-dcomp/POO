// 1. Importa a classe Scanner
import java.util.Scanner;

/**
 * Exercício 4: Cálculo de Ingresso
 * @author João Guilherme de Aragão
 * Lê idade (int) e preço (double) e calcula o desconto..
 */
public class IngressoCircoAntigo {

    public static void main(String[] args) {
        
        // 2. Cria o objeto Scanner
        var leitor = new Scanner(System.in);
        
        System.out.println("--- Bilheteria do Circo ---");
        
        // 3. Ler a Idade (int)
        System.out.print("Digite a idade do visitante: ");
        var entradaIdade = leitor.nextLine();
        var idade = Integer.parseInt(entradaIdade);
        
        // 4. Ler o Preço Normal (double)
        System.out.print("Digite o preço normal do ingresso (ex: 50.00): ");
        var entradaPreco = leitor.nextLine();
        var precoNormal = Double.parseDouble(entradaPreco);

        // 5. Declarar as variáveis
        double precoFinal;
        String mensagemDesconto;

        // 6. Lógica do Desconto
        // || para juntar as duas condições de 50%
        if (idade <= 18 || idade >= 60) {
            // Desconto de 50% (metade do preço)
            precoFinal = precoNormal * 0.50; 
            mensagemDesconto = "Desconto de 50% (meia-entrada) aplicado.";
        } else {
            // Desconto de 10% (paga 90% do valor)
            precoFinal = precoNormal * 0.90;
            mensagemDesconto = "Desconto de 10% aplicado.";
        }

        // 7. Apresentar o resultado
        System.out.println("------------------------------------");
        System.out.println(mensagemDesconto);
        
        // Formatando o dinheiro para 2 casas decimais
        var precoFormatado = String.format("%.2f", precoFinal);
        System.out.println("Valor final a pagar: R$ " + precoFormatado);
        
        // 8. Fecha o Scanner
        leitor.close();
    }
}