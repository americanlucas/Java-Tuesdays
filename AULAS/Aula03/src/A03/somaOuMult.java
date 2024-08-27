package A03;

import java.util.Scanner;

public class somaOuMult {
	
	//processamento
	public static void operacao (int x, int y) {
		if (x >= 0 && y >= 0) {
			int mult = x * y;
			System.out.printf("O resultado é: %d", mult);
		} else {
			int soma = x + y;
			System.out.printf("O resultado é: %d", soma);
		}
	}

	public static void main(String[] args) {
		// var e scan
		Scanner sc = new Scanner (System.in);
		
		//Entrada
		System.out.print("Digite dois números (positivos para multiplicação, um deles negativo para soma):  ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//saida
		operacao(a,b);
	}

}
