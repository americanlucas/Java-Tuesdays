package EXERCICIO_LISTA;

import java.util.Scanner;

public class descontoProduto {

	public static void main(String[] args) {
		// var e scan
		Scanner leitor = new Scanner (System.in);
		
		double produto, desconto, valorFinal;
		
		//entrada
		System.out.print("Digite o valor do produto: ");
		produto = leitor.nextInt();

		leitor.close();
		
		//processamento
		desconto = produto * 0.1;
		
		valorFinal = produto - desconto;
		
		//saida
		System.out.println("O valor do produto com desconto é: " + valorFinal);
	}

}
