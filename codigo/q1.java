/**
 * Exercício 1: Par ou Ímpar
 * @author João Guilherme de Aragão
 */
void main() {

    // 1. Pede o número ao usuário
    IO.print("Digite um número inteiro: ");
    
    // 2. Lê a linha de texto que o usuário digitou
    var entrada = IO.readln();
    
    // 3. Converte o texto para o número
    var numero = Integer.parseInt(entrada);
    
    // 4. Lógica para verificar se o resto da divisão por 2 é 0
    if (numero % 2 == 0) {
        // 5. Imprime o resultado
        IO.println("O número " + numero + " é par.");
    } else {
        IO.println("O número " + numero + " é ímpar.");
    }
}