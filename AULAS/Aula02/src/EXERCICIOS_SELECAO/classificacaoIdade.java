package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class classificacaoIdade {

	public static void main(String[] args) {
		// var e scan
		Scanner leitor = new Scanner (System.in);
		
		int idade;

		//entrada 
		System.out.print("Digite a sua idade: ");
		idade = leitor.nextInt();
		
		leitor.close();
		
		//processamento e saida
		if (idade <= 9) {
			System.out.print("Você é MIRIM");
		} else if (idade <= 13) {
			System.out.print("Você é INFANTIL");
		} else if (idade <= 17) {
			System.out.print("Você é JUVENIL");
		} else {
			System.out.print("Você é ADULTO");
		}
	}

}
