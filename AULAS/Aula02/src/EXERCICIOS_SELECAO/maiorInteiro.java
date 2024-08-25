package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class maiorInteiro {

	public static void main(String[] args) {
		//VAR
		Scanner leitor = new Scanner (System.in);
		
		int x, y;

		//entrada
		System.out.print("Digite o valor de x: ");
		x = leitor.nextInt();
		
		System.out.print("Digite o valor de y: ");
		y = leitor.nextInt();
		
		leitor.close();
		
		//processador
		if (x > y) {
			System.out.printf("O maior número é %d", x);
		} else {
			System.out.printf("O maior número é %d", y);
		}
	}

}
