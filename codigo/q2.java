public class q2 {
    /**
 * Exercício 2: Média Aritmética
 * @author João Guilherme de Aragão
 */

/**
 * Ele recebe três números double e retorna a média.
 */
double calcularMedia(double num1, double num2, double num3) {
    var soma = num1 + num2 + num3;
    var media = soma / 3.0;
    return media;
}

/**
 * Este é o programa principal que lê os números e chama o método.
 */
void main() {
    IO.println("--- Calculadora de Média Aritmética ---");
    
    // --- Lendo os três números ---
    
    IO.print("Digite o primeiro número: ");
    var entrada1 = IO.readln();
    var num1 = Double.parseDouble(entrada1);
    
    IO.print("Digite o segundo número: ");
    var entrada2 = IO.readln();
    var num2 = Double.parseDouble(entrada2);
    
    IO.print("Digite o terceiro número: ");
    var entrada3 = IO.readln();
    var num3 = Double.parseDouble(entrada3);

    // --- Chamando o método ---
    
    // Chama o método 'calcularMedia' que definimos acima
    var mediaCalculada = calcularMedia(num1, num2, num3);
    
    // --- Imprimindo o resultado ---
    
    IO.println("---------------------------------");
    IO.println("A média dos três números é: " + mediaCalculada);
}
}
