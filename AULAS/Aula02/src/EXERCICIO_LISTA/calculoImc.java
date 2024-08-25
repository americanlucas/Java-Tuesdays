package EXERCICIO_LISTA;

import java.util.Scanner;

public class calculoImc {

	public static void main(String[] args) {
		// var e scan
		Scanner leitor = new Scanner (System.in);
		
		double imc, peso, altura;
		
		//entrada
		System.out.print("Digite o seu peso: ");
		peso = leitor.nextDouble();
		
		System.out.print("Digite a sua altura: ");
		altura = leitor.nextDouble();
		
		leitor.close();
		
		//processamento
		imc = (peso / (Math.pow(altura, 2)));
		
		//saida 
		System.out.println("Seu IMC é igual a " + imc);
	}

}
