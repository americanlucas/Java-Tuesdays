package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class multiplicacaoInteiros {

	public static void main(String[] args) {
		// var e scan
		Scanner leitor = new Scanner (System.in);
		
		int x, y, mult, soma;

		//entrada
		System.out.println("POSITIVOS PARA MULTIPLICAÇÃO, AO MENOS UM NEGATIVO PARA SOMA.");
		System.out.print("Digite o Primeiro Valor: ");
		x = leitor.nextInt();
		
		System.out.print("Digite o Segundo Valor: ");
		y = leitor.nextInt();
		
		leitor.close();
		//processamento e saida
		if (x > 0 && y > 0) {
			mult = x * y;
			System.out.printf("O resultado da multiplicação é: %d", mult);
		} else {
			soma = x + y;
			System.out.printf("O resultado da soma é: %d", soma);
		}
	}

}
