/*Defina um programa que calcule quantos dias faltam para o próximo São João. O programa recebe como entradas três inteiros correspondentes ao dia, mês e ano atuais. A solução deve considerar que um ano pode ser bissexto. Chama-se ano bissexto o ano ao qual é acrescentado um dia extra, ficando ele com 366 dias, um dia a mais do que os anos normais de 365 dias, ocorrendo a cada quatro anos (exceto anos múltiplos de 100 que não são múltiplos de 400). Não utilize nenhuma biblioteca Java.
 * dia, mes, ano
 * bissexto ou 365 ou 366
 * são joão é dia 24 de junho
 * 175º dia do ano
 */

import java.util.Scanner;

public class SaoJoao {
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        int dia = scanner.nextInt();
        int diasFaltantes = diasParaSaoJoao(dia, mes, ano);
        System.out.println("Faltam " + diasFaltantes + " dias para o próximo São João!");
        scanner.close();
    } 
    static int diasParaSaoJoao(int dia, int mes, int ano){
        
        int diaOrdinalHoje = diaOrdinal(dia, mes, ano);
        int diaSJOAtual = diaOrdinal(24, 6, ano);
        
        
        if (diaOrdinalHoje < diaSJOAtual) {
            return diaSJOAtual - diaOrdinalHoje;
        } 
        
       
        else {
            
            int diasNoAnoAtual;
            if (bissexto(ano)) {
                diasNoAnoAtual = 366;
            } else {
                diasNoAnoAtual = 365;
            }
            int diasRestantesEsteAno = diasNoAnoAtual - diaOrdinalHoje;
            
            int diaSJOProximoAno = diaOrdinal(24, 6, ano + 1);
            
            return diasRestantesEsteAno + diaSJOProximoAno;
        }
    }

    static int diaOrdinal(int dia, int mes, int ano) {
        int totalDias = 0;
              
        for (int m = 1; m < mes; m++) {
            totalDias += diasNoMes(m, ano);
        } 
        totalDias += dia;
        
        return totalDias;
    }

      static int diasNoMes(int mes, int ano){
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