package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class ordenacao {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
        int a;
        int b;
        int c;

        //entrada
        System.out.println("Informe o valor do primeiro numero: ");
		a = leitor.nextInt();
		System.out.println("Informe o valor do segundo numero: ");
		b = leitor.nextInt();
		System.out.println("Informe o valor do terceiro numero: ");
		c = leitor.nextInt();
		
        leitor.close();
        
        //processamento
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // saida
        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
    }
}
