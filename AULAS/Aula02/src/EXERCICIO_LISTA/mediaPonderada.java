package EXERCICIO_LISTA;

import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		// var e scan
		Scanner leitor = new Scanner (System.in);
		
		int x, y, z; 
		double media;
		
		//entrada
		System.out.print("Digite o valor 1: ");
		x = leitor.nextInt();
		
		System.out.print("Digite o valor 2: ");
		y = leitor.nextInt();
		
		System.out.print("Digite o valor 3: ");
		z = leitor.nextInt();
		
		leitor.close();
		
		//processamento
		media = ((x + y + z) / (2 + 3 + 5));
		
		//saida
		System.out.println("O resultado da média ponderada é: " + media);
	}

}
