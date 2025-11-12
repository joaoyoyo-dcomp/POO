/**
 * Escreva um programa que leia três números e que diga quantos destes estão acima da média.
 * 
 */
import java.util.Scanner;

public class AcimaDaMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double d1 = scanner.nextDouble();
        double d2 = scanner.nextDouble();
        double d3 = scanner.nextDouble();
        System.out.println(acimaDaMedia(d1,d2,d3));
        scanner.close();
    }   
    static int acimaDaMedia(double d1, double d2, double d3){
        double media = (d1+d2+d3)/3;
        int acima = 0;
        if(d1>media)
        acima++;
        if(d2>media)
        acima++;
        if(d3>media)
        acima++;
        return acima;
    }
}
