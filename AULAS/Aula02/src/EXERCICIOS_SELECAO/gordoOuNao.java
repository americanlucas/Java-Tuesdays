package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class gordoOuNao {

	public static void main(String[] args) {
		//var e scan
		double imc, h2;
		Scanner sc = new Scanner(System.in);
		int peso, h;
		String sexo;
		
		//entrada
		System.out.println("Dê  o peso: ");
		peso = sc.nextInt();
		System.out.println("Dê a altura: ");
		h = sc.nextInt();
		System.out.println("Dê o seu sexo: (F ou M) ");
		sexo = sc.next();
		
		// processamento e saida
		h2 = (double) h / 100;
		imc = (double) peso / (h2 * h2);
		if ("F".equals(sexo)) {
			if (imc < 17.00) {
				System.out.printf("Voce está abaixo do peso");
			} else if (imc >= 17.00 && imc < 26.00) {
				System.out.printf("Voce está com peso ideal");
			} else if (imc >= 26.00) {
				System.out.printf("Voce está acima do peso");
			} else {
				System.out.printf("Error!");
			}
		} else if ("M".equals(sexo)) {
			if (imc < 18.00) {
				System.out.printf("Voce está abaixo do peso");
			} else if (imc >= 18.00 && imc < 27.00) {
				System.out.printf("Voce está com peso ideal");
			} else if (imc >= 27.00) {
				System.out.printf("Voce está acima do peso");
			} else {
				System.out.printf("Error!");
			}
		} else {
			System.out.printf("Error!");
		}
		sc.close();
	}

}
