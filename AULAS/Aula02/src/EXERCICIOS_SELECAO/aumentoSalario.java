package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class aumentoSalario {

	public static void main(String[] args) {
		// var e scan 
		Scanner leitor = new Scanner (System.in);
		
		int salario;
		double aumento1, aumento2;
		
		//entrada
		System.out.print("Digite o seu salário: ");
		salario = leitor.nextInt();
		
		leitor.close();
		
		//processamento e saida
		if (salario > 1000) {
			aumento1 = 1.1 * salario;
			System.out.printf("Seu salário com aumento é: %.2f", aumento1);
		} else {
			aumento2 = 1.05 * salario;
			System.out.printf("Seu salário com aumento é: %.2f", aumento2);
		}
	}

}
