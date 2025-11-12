public class q3 {
    /**
 * Exercício 3: Positivo, Negativo ou Nulo
 * Programa que lê um inteiro e descreve sua magnitude.
 * @author João Guilherme de Aragão
 */

/**
 * Método de lógica: Recebe um inteiro e retorna a string de descrição (Positivo, Negativo ou Nulo).
 */
String descreverNumero(int numero) {
    if (numero == 0) {
        // Caso 1: Nulo
        return "Nulo";
        
    } else if (numero > 0) {
        // Caso 2: Positivo. A magnitude é o próprio número.
        return "Positivo " + numero;
        
    } else {
        // Caso 3: Negativo. A magnitude é o número * -1.
        var magnitude = numero * -1;
        return "Negativo " + magnitude;
    }
}

/**
 * Programa principal que lê o número e chama o método.
 */
void main() {
    IO.print("Digite um número inteiro (ex: 15 ou -15): ");
    
    // Lê e converte o número
    var entrada = IO.readln();
    var numeroLido = Integer.parseInt(entrada);
    
    // Chama o método de lógica
    var descricao = descreverNumero(numeroLido);
    
    // Imprime o resultado
    IO.println(descricao);
}
}
