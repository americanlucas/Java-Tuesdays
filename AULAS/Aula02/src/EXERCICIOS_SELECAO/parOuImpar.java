package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		// var e scan
		Scanner leitor = new Scanner (System.in);
		
		int x = 0;

		//entrada
		System.out.print("Digite o valor de x: ");
		x = leitor.nextInt();
		
		leitor.close();
		//processamento
		if (x%2 == 0) {
			System.out.printf("%d é par" , x );
		} else {
			System.out.printf("%d é impar", x);
		}
	}

}
