//Escreva um programa que, dado um mês e um ano, diga quantos dias tem o mês. Considere anos bissextos.

import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        System.out.println(diasDoMes(mes,ano));
        scanner.close();
    }    
    static int diasDoMes(int mes, int ano){
        return switch(mes){
            case 2-> bissexto(ano) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }
    static boolean bissexto(int ano){
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }
}
