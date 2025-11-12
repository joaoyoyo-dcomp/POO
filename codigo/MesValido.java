/*Faça um programa que leia um número inteiro e informe qual o mês do ano correspondente por extenso. Caso seja um mês inválido, informe ao usuário. Considere que o mês de janeiro como 1 e o mês de dezembro como 12. As possíveis saídas do programa são:
janeiro
fevereiro
marco
abril
maio
junho
julho
agosto
setembro
outubro
novembro
dezembro 
switch, case default*/

import java.util.Scanner;

public class MesValido {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o número do mês (1-12): ");
    int mes = scanner.nextInt();
    System.out.println(mesValido(mes));
    scanner.close();
    }
    static String mesValido(int mes){
        return switch(mes){
        case 1 -> "Janeiro";
        case 2 -> "Fevereiro";
        case 3 -> "Março";
        case 4 -> "Abril";
        case 5 -> "Maio";
        case 6 -> "Junho";
        case 7 -> "Julho";
        case 8 -> "Agosto";
        case 9 -> "Setembro";
        case 10 -> "Outubro";
        case 11 -> "Novembro";
        case 12 -> "Dezembro";
        default -> "Mês inválido";
        };}}

