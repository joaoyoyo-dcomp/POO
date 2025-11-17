/*
 Defina um sistema pequeno que permita representar uma lista de tópicos de aulas. Considere que um tópico de aula tem uma data, um título e um assunto. Deverá haver uma funcionalidade que permita listar na tela todos os tópicos de uma lista. Deverá também ter uma funcionalidade que permita adicionar um tópico a uma lista de tópicos. 

 
 public class TopicoAula {
    String data;
    String titulo;
    String assunto;
    
    public TopicoAula(String data, String titulo, String assunto) {
        this.data = data;
        this.titulo = titulo;
        this.assunto = assunto;
    }
    
    public String toString() {
        return "Data: " + this.data + 
        " | Título: " + this.titulo + 
        " | Assunto: " + this.assunto;
    }
}

*/
import java.util.Scanner;

/**
 * Classe principal (SistemaDeAulas) que gerencia o sistema.
 * Ela contém o 'main' (executor) e os métodos de instância
 * para gerenciar a lista de tópicos.
 * Esta classe *usa* a classe TopicoAula.
 */

 public class SistemaDeAulas {
    
    // --- Atributos de Instância (O "Gerenciador") ---
    // Estes atributos pertencem a cada *objeto* SistemaDeAulas
    
    // O Array que armazena os tópicos (Constraint: Deve usar array)
    private TopicoAula[] listaDeTopicos; 
    
    // O contador de quantos tópicos realmente temos
    private int totalTopicos;
    
    // O Scanner que será usado pelo sistema
    private Scanner scanner;
    
    // Constante para o tamanho máximo
    private static final int MAX_TOPICOS = 100;

    /**
     * Construtor do SistemaDeAulas.
     * Inicializa os atributos da instância (o array, o contador, o scanner).
     */
    public SistemaDeAulas() {
        this.listaDeTopicos = new TopicoAula[MAX_TOPICOS];
        this.totalTopicos = 0;
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Ponto de Entrada Estático (main).
     * A única responsabilidade dele é criar a instância
     * do sistema e iniciar o menu.
     */
    public static void main(String[] args) {
        // 1. Cria o objeto (a instância) do sistema
        SistemaDeAulas meuSistema = new SistemaDeAulas();
        
        // 2. Chama o método de instância (não-estático)
        meuSistema.executarMenu();
    }
    
    /**
     * Método de Instância (Executor)
     * Contém o loop principal e o menu do sistema.
     */
    public void executarMenu() {
        System.out.println("--- Sistema de Tópicos de Aula (POO) ---");
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Tópico");
            System.out.println("2. Listar Tópicos");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            
            switch (opcao) {
                case 1:
                    // Chama a Funcionalidade 1 (Adicionar)
                    adicionarTopico();
                    break;
                case 2:
                    // Chama a Funcionalidade 2 (Listar)
                    listarTopicos();
                    break;
                case 3:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        
        scanner.close(); // Fecha o scanner ao sair
    }

    /**
     * Funcionalidade 1 (Método de Instância - Pedido na Questão):
     * Permite adicionar um tópico à lista (ao array 'this.listaDeTopicos').
     */
    public void adicionarTopico() {
        // 1. Verifica se a lista (array) está cheia
        if (this.totalTopicos >= MAX_TOPICOS) {
            System.out.println("Erro: A lista de tópicos está cheia!");
            return;
        }
        
        // 2. Pede os dados (usa o scanner da instância)
        System.out.print("Digite a data (ex: 17/11/2025): ");
        String data = this.scanner.nextLine();
        
        System.out.print("Digite o título da aula: ");
        String titulo = this.scanner.nextLine();
        
        System.out.print("Digite o assunto (ex: POO): ");
        String assunto = this.scanner.nextLine();
        
        // 3. Cria o objeto TopicoAula (o "molde")
        TopicoAula novoTopico = new TopicoAula(data, titulo, assunto);
        
        // 4. Adiciona o objeto ao array da instância
        this.listaDeTopicos[this.totalTopicos] = novoTopico;
        
        // 5. Incrementa o contador da instância
        this.totalTopicos++;
        
        System.out.println("Tópico adicionado com sucesso!");
    }
    
    /**
     * Funcionalidade 2 (Método de Instância - Pedido na Questão):
     * Permite listar na tela todos os tópicos da lista.
     */
    public void listarTopicos() {
        // 1. Verifica se a lista está vazia
        if (this.totalTopicos == 0) {
            System.out.println("\nA lista de tópicos está vazia.");
            return;
        }
        
        System.out.println("\n--- Lista de Tópicos de Aula ---");
        
        // 2. Faz um loop de 0 até o total de tópicos
        for (int i = 0; i < this.totalTopicos; i++) {
            // Imprime o tópico
            // O Java chama o .toString() do TopicoAula
            System.out.println((i + 1) + ". " + this.listaDeTopicos[i]);
        }
        System.out.println("------------------------------------");
    }
}


/**
 * Classe "Molde" (Data-Class) para representar um Tópico de Aula.
 * Como ela não é 'public', ela só pode ser usada
 * dentro deste arquivo (pela classe SistemaDeAulas).
 */
class TopicoAula {
    
    // Atributos
    String data;
    String titulo;
    String assunto;
    
    /**
     * Construtor para criar um novo Tópico de Aula.
     */
    public TopicoAula(String data, String titulo, String assunto) {
        this.data = data;
        this.titulo = titulo;
        this.assunto = assunto;
    }
    
    /**
     * Retorna uma representação em String do tópico.
     * Usado pelo método 'listarTopicos()'.
     */
    @Override
    public String toString() {
        return "Data: " + this.data + 
               " | Título: " + this.titulo + 
               " | Assunto: " + this.assunto;
    }
}