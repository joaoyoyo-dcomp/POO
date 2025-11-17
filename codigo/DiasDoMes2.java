/*
O exercício 8 da lista de exercícios anterior, que pede para calcular quantos dias tem um mês, com o cuidado de considerar ano bissexto, pode ser implementado usando apenas um comando condicional para considerar o caso particular do mês de fevereiro. Para isto, pode-se utilizar o array
	int[] diasDoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
que, sem considerar o caso especial de ano bissexto, contém quantos dias cada mês tem. Em particular, o elemento diasDoMes[m-1] contém quantos dias tem o mês m. Reimplemente o exercício usando este array. Não esqueça de tratar ano bissexto. 
 */

import java.util.Scanner;

public class DiasDoMes2 {

    static final int[] DiasdoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        System.out.println(diasMes(mes, ano));
        scanner.close();
    } 
    
    static int diasMes(int mes, int ano){
        int dias = DiasdoMes[mes - 1];
        if (mes == 2 && bissexto(ano)) {
            dias = 29;
        }    
        return dias;
    }
    
    static boolean bissexto(int ano){
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }
}