package EXERCICIO_LISTA;

import java.util.Scanner;

public class multiplicador {

	public static void main(String[] args) {
		// var e scanner
		Scanner leitor = new Scanner (System.in);
		
		int x, dobro, triplo, quadruplo;
		
		//entrada 
		System.out.print("Digite o valor para saber multiplicadores: ");
		x = leitor.nextInt();
		
		leitor.close();
		
		//processamento
		dobro = x * 2;
		triplo = x * 3;
		quadruplo = x * 4;
		
		//saida
		System.out.println("Do dobro de " + x + " é " + dobro);
		System.out.println("Do triplo de " + x + " é " + triplo);
		System.out.println("Do quadruplo de " + x + " é " + quadruplo);
	}

}
