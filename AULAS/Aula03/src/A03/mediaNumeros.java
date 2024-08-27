package A03;

import java.util.Locale;
import java.util.Scanner;

public class mediaNumeros {
	
	
	//processamento
	public static int num (int a, int b, int c) {
		int media = (a + b + c) / 10;
		return media;
	}
	
	
	public static void main(String[] args) {
		//var e scan
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		//entrada 
		System.out.print("Digite as três notas: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		double resultado = num(a,b,c);
		
		//saida
		System.out.printf("O resultado da média é: %.2f %n", resultado);
	}

}
