package EXERCICIO_LISTA;

import java.util.Scanner;

public class somaNumerica {

	public static void main(String[] args) {
		// var e scanner
		Scanner leitor = new Scanner (System.in);
		
		int x, y, z, soma;
		
		//entrada
		System.out.print("Digite o Primeiro Valor: ");
		x = leitor.nextInt();
		System.out.print("Digite o Segundo Valor: ");
		y = leitor.nextInt();
		System.out.print("Digite o TYerceiro Valor: ");
		z = leitor.nextInt();
		
		leitor.close();
		
		//processamento
		soma = x + y + z;
		
		//saida
		System.out.println("A soma total é: " + soma);
	}

}
