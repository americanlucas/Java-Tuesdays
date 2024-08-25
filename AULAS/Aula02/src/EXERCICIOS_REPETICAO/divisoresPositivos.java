package EXERCICIOS_REPETICAO;

import java.util.Scanner;

public class divisoresPositivos {

	public static void main(String[] args) {
		// Scan e var
		Scanner leitor = new Scanner (System.in);
		
		int x, i;
		
		//entrada
		System.out.println("Digite um número: ");
		x = leitor.nextInt();
		
		leitor.close();
		
		//processamento
		for (i = 1; i <= 10000; i++) {
			if (x%i == 0) {
				System.out.println(i);
			} 
		}
	}

}
