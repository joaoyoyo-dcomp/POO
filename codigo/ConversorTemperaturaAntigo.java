// 1. Importa a classe Scanner
import java.util.Scanner;

/**
 * Exercício 5: Conversor de Temperatura
 * @author João Guilherme de Aragão
 * Define métodos estáticos para C -> F e F -> C e permite ao usuário escolher.
 */
public class ConversorTemperaturaAntigo {

    /**
     * Programa principal que mostra o menu e chama os métodos.
     */
    public static void main(String[] args) {
        
        // 2. Cria o Scanner
        var leitor = new Scanner(System.in);
        
        System.out.println("--- Conversor de Temperatura ---");
        System.out.println("1: Converter de Fahrenheit (F) para Celsius (C)");
        System.out.println("2: Converter de Celsius (C) para Fahrenheit (F)");
        System.out.print("Digite sua opção (1 ou 2): ");
        
        // 3. Lê a escolha do usuário
        var entradaOpcao = leitor.nextLine();
        var opcao = Integer.parseInt(entradaOpcao);

        // 4. Lógica do Menu
        if (opcao == 1) {
            // --- Caminho 1: Fahrenheit para Celsius ---
            System.out.print("Digite a temperatura em Fahrenheit (°F): ");
            var entradaTemp = leitor.nextLine();
            var tempF = Double.parseDouble(entradaTemp);
            
            // Chama o método estático
            var tempC = fahrenheitParaCelsius(tempF); 
            
            var tempFFormatado = String.format("%.1f", tempF);
            var tempCFormatado = String.format("%.1f", tempC);
            System.out.println(tempFFormatado + "°F equivale a " + tempCFormatado + "°C.");
            
        } else if (opcao == 2) {
            // --- Caminho 2: Celsius para Fahrenheit ---
            System.out.print("Digite a temperatura em Celsius (°C): ");
            var entradaTemp = leitor.nextLine();
            var tempC = Double.parseDouble(entradaTemp);
            
            // Chama o método estático
            var tempF = celsiusParaFahrenheit(tempC);
            
            var tempCFormatado = String.format("%.1f", tempC);
            var tempFFormatado = String.format("%.1f", tempF);
            System.out.println(tempCFormatado + "°C equivale a " + tempFFormatado + "°F.");
            
        } else {
            // --- Caminho de Erro ---
            System.out.println("Opção inválida. O programa será encerrado.");
        }
        
        // 5. Fecha o Scanner
        leitor.close();
    }

    /**
     * Método 1: Converte Celsius para Fahrenheit.
     */
    public static double celsiusParaFahrenheit(double celsius) {
        var fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return fahrenheit;
    }

    /**
     * Método 2: Converte Fahrenheit para Celsius.
     */
    public static double fahrenheitParaCelsius(double fahrenheit) {
        var celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }
}