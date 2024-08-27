package A03;

import java.util.Scanner;

public class multTresECinco {
	
	//processamento
	public static void mult (int x) {
		if (x%3 == 0 && x%5 == 0) {
			System.out.printf("%d é divisível por 3 e por 5", x);
		} else if (x%3 == 0 || x%5 != 0) {
			System.out.printf("%d é divisível apenas por 3", x);
		} else {
			System.out.printf("%d é divisível apenas por 5", x);
		}
	}

	public static void main(String[] args) {
		// var e scan 
		Scanner sc = new Scanner (System.in);
		
		//Entrada 
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		
		//saida
		mult(num);

	}

}
