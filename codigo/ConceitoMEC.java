/*
 * Anualmente, o MEC avalia os cursos universitários de todo o país e atribui conceitos com base em diversos critérios, sendo um deles a quantidade de livros disponíveis. Considerando as regras definidas abaixo, escreva um programa que receba como entrada a quantidade de livros e a quantidade de alunos de um curso, ambos inteiros, e retorne a letra maiúscula correspondente ao conceito concedido pelo MEC.
1 livro para até 8 alunos --> Conceito A
1 livro para entre 9 e 12 alunos --> Conceito B
1 livro para entre 13 e 18 alunos --> Conceito C
1 livro para mais de 18 alunos --> Conceito D

 */
import java.util.Scanner;

public class ConceitoMEC{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int livros = scanner.nextInt();
        int alunos = scanner.nextInt();
        String conceito = calcularConceito(livros, alunos);
        System.out.println(conceito);
        scanner.close();
    } 
    
    static String calcularConceito(int livros, int alunos) {
    
        if (alunos == 0) {
            return "A";
        }
        if (livros == 0) {
            return "D"; 
        }

        double alunosPorLivro = (double)alunos/(double)livros;
        
        if (alunosPorLivro <= 8) {
            return "A";
        } else if (alunosPorLivro <= 12) {
            return "B";
        } else if (alunosPorLivro <= 18) {
            return "C";
        } else {
            return "D";
        }
    }
}
