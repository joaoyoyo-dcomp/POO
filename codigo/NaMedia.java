/*Escreva um programa que leia três números e que diga qual é o mais próximo da média. Se houver vários números mais próximos, apresente apenas um, qualquer.
se há 3 números
 */

import java.util.Scanner;

public class NaMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();
        System.out.println(naMedia(d1,d2,d3));
        scanner.close();
    }   
    static double naMedia(double d1, double d2, double d3){
        double media = (d1+d2+d3)/3.0;
        double dist1 = Math.abs(d1 - media);
        double dist2 = Math.abs(d2 - media);
        double dist3 = Math.abs(d3 - media);
        double numeroMaisProximo = d1;
        double menorDistancia = dist1;
        
        if (dist2 < menorDistancia) {
            menorDistancia = dist2;
            numeroMaisProximo = d2;
        }
        
        if (dist3 < menorDistancia) {
            numeroMaisProximo = d3;
        }
        
        return numeroMaisProximo;
    }
}
