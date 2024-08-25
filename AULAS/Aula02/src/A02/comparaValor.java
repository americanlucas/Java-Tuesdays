package A02;

import java.util.Scanner;

public class comparaValor {
	public static void main (String args[]) {
		//var
		Scanner leitor = new Scanner (System.in);
		
		int x;
		
		//entrada
		System.out.print("x: ");
		
		x = leitor.nextInt();
		leitor.close();
		
		//processamento
		if (x > 2) {
			System.out.printf(x + " é maior do que 2");
		} else if (x < 2) {
			System.out.println(x + " é menor do que 2");
		} else {
			System.out.println(x + " é igual a 2");
		}
		
		//saida
	}
}
