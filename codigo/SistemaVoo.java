import java.util.Scanner;

public class SistemaVoo {
    boolean[] assentos;

    public SistemaVoo() {
        this.assentos = new boolean[16];
        this.assentos[0] = true;
        this.assentos[2] = true; 
        this.assentos[5] = true; 
        this.assentos[6] = true;  
        this.assentos[9] = true;
        this.assentos[10] = true; 
    }
    public static void main(String[] args) {
        SistemaVoo meuVoo = new SistemaVoo();
        meuVoo.executarSistemaDeReserva();
    }
    
    /**
     * Método de Instância (NÃO-ESTÁTICO)
     * Contém toda a lógica do programa que antes estava no 'main'.
     * Ele opera sobre os assentos DESTE objeto.
     */
    public void executarSistemaDeReserva() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Sistema de Reserva de Voo ---");
        System.out.println("Assentos disponíveis:");
        imprimirMapa(); // Chama o método de instância

        // 1. Perguntar a Classe
        System.out.println("\nPor favor, escolha a classe:");
        System.out.println("1: Primeira Classe (Assentos 1-4)");
        System.out.println("2: Classe Econômica (Assentos 5-16)");
        System.out.print("Opção: ");
        int classeEscolhida = scanner.nextInt();

        // 2. Validar a Classe
        if (classeEscolhida != 1 && classeEscolhida != 2) {
            System.out.println("Opção inválida. Encerrando.");
            scanner.close();
            return;
        }
        
        // 3. Verificar se a classe está lotada (chama o método de instância)
        if (isClasseCheia(classeEscolhida)) {
            System.out.println("Desculpe, a classe escolhida está lotada. Encerrando.");
            scanner.close();
            return;
        }

        // 4. Perguntar o modo de escolha
        System.out.println("\nDeseja escolher o assento ou prefere atribuição automática?");
        System.out.println("1: Escolher assento manualmente");
        System.out.println("2: Atribuição automática");
        System.out.print("Opção: ");
        int tipoEscolha = scanner.nextInt();

        int assentoParaReservar = -1;

        if (tipoEscolha == 1) {
            // --- 5a. Lógica de Escolha Manual ---
            System.out.print("Digite o número do assento (1-16): ");
            int assentoEscolhido = scanner.nextInt();
            
            if (assentoEscolhido < 1 || assentoEscolhido > 16) {
                System.out.println("Assento inválido (deve ser 1-16). Encerrando.");
                scanner.close();
                return;
            }

            if (!validarClasseDoAssento(classeEscolhida, assentoEscolhido)) {
                scanner.close();
                return;
            }
            
            if (isAssentoOcupado(assentoEscolhido)) {
                System.out.println("Assento " + assentoEscolhido + " já está ocupado. Encerrando.");
                scanner.close();
                return;
            }
            
            assentoParaReservar = assentoEscolhido;
            
        } else if (tipoEscolha == 2) {
            // --- 5b. Lógica de Escolha Automática ---
            assentoParaReservar = encontrarAssentoLivre(classeEscolhida);
            System.out.println("O sistema atribuiu a você o assento: " + assentoParaReservar);
            
        } else {
            System.out.println("Opção inválida. Encerrando.");
            scanner.close();
            return;
        }
        
        // --- 6. Fazer a Reserva ---
        // 'assentos' agora se refere a 'this.assentos'
        assentos[assentoParaReservar - 1] = true;
        
        System.out.println("\nRESERVA CONFIRMADA: Assento " + assentoParaReservar);
        
        // 7. Mostrar o mapa final
        System.out.println("Mapa de assentos atualizado:");
        imprimirMapa();
        
        scanner.close();
    }
    
    /**
     * Imprime o mapa de assentos (NÃO é mais static)
     * Opera sobre o array 'this.assentos'
     */
    void imprimirMapa() {
        for (int i = 0; i < this.assentos.length; i++) {
            int numeroAssento = i + 1;
            if (this.assentos[i]) {
                System.out.print(numeroAssento + "X ");
            } else {
                System.out.print(numeroAssento + " ");
            }
        }
        System.out.println();
    }
    
    /**
     * Verifica se um assento (1-16) já está ocupado (NÃO é mais static)
     */
    boolean isAssentoOcupado(int numeroAssento) {
        return this.assentos[numeroAssento - 1];
    }

    /**
     * Verifica se a classe está lotada (NÃO é mais static)
     */
    boolean isClasseCheia(int classe) {
        if (classe == 1) {
            for (int i = 0; i <= 3; i++) {
                if (this.assentos[i] == false) return false;
            }
        } else {
            for (int i = 4; i <= 15; i++) {
                if (this.assentos[i] == false) return false;
            }
        }
        return true;
    }

    /**
     * Encontra o primeiro assento livre (NÃO é mais static)
     */
    int encontrarAssentoLivre(int classe) {
        if (classe == 1) {
            for (int i = 0; i <= 3; i++) {
                if (this.assentos[i] == false) return i + 1;
            }
        } else {
            for (int i = 4; i <= 15; i++) {
                if (this.assentos[i] == false) return i + 1;
            }
        }
        return -1;
    }
    
    /**
     * Verifica se o assento escolhido pertence à classe (NÃO é mais static)
     */
    boolean validarClasseDoAssento(int classe, int assento) {
        boolean assentoEhPrimeira = (assento >= 1 && assento <= 4);
        boolean assentoEhEconomica = (assento >= 5 && assento <= 16);
        
        if (classe == 1 && !assentoEhPrimeira) {
            System.out.println("Erro: Assento " + assento + " não pertence à Primeira Classe. Encerrando.");
            return false;
        }
        if (classe == 2 && !assentoEhEconomica) {
            System.out.println("Erro: Assento " + assento + " não pertence à Classe Econômica. Encerrando.");
            return false;
        }
        return true;
    }
}