package A03;

import java.util.Scanner;

public class parOuImpar {
	
	//porcessamento
	public static void parOuImpar(int x) {
		if (x%2 ==0) {
			System.out.printf("%d é par!", x);
		} else {
			System.out.printf("%d é ímpar!", x);
		}
	} 

	public static void main(String[] args) {
		// var e scan
		Scanner sc = new Scanner (System.in);
		
		//entrada
		System.out.print("Digite um número para saber se é par ou ímpar: ");
		int num = sc.nextInt();
		
		//saida
		parOuImpar(num);
	}

}
