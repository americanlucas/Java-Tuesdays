package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class numeroDivisivel {

	public static void main(String[] args) {
		// var e scan
		Scanner leitor = new Scanner (System.in);
		
		int x = 0;
		
		//entrada 
		System.out.print("Digite um número: ");
		x = leitor.nextInt();
		
		leitor.close();
		
		//processamento e saida
		if (x%3 == 0 && x%5 ==0) {
			System.out.print("Este número é divisível por 3 e por 5");
		} else if (x%3 != 0 && x%5 == 0) {
			System.out.print("Este número é divisível apenas por 5");
		} else if (x%3 == 0 && x%5 != 0) {
			System.out.print("Este número é divisível apenas por 3");
		} else {
			System.out.print("Este número não é divisível por nenhum dos dois");
		}
		
	}

}
