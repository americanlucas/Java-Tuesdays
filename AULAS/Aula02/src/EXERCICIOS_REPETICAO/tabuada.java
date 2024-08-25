package EXERCICIOS_REPETICAO;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// var e scan
		
		Scanner leitor = new Scanner (System.in);

		int i, x, tabuada;
		
		//entrada
		System.out.print("Digite um número para tabuada (1 - min, 10 - max): ");
		x = leitor.nextInt();
		
		leitor.close();
		
		//processamento
		for (i = 1; i <= 10; i++) {
			tabuada = i * x;
			System.out.println(tabuada);
		}
	}

}
