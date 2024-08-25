package A02;

import java.util.Scanner;

public class solicitarOperador {

	public static void main(String[] args) {
		//var
		Scanner leitor = new Scanner (System.in);
		
		int x = 0;
		int y = 0;
		int operacao;
		
		//entrada
		System.out.println("Informe o valor do primeiro numero: ");
		x = leitor.nextInt();
		System.out.println("Informe o valor do segundo numero: ");
		y = leitor.nextInt();
		System.out.print("Informe qual operação utilizar (1 - soma, 2 - subtração, 3 - divisão, 4 - multiplicação): ");
		operacao = leitor.nextInt();
		
		
		leitor.close();
		
		//processamento
		switch (operacao) {
			case 1:
			operacao = x + y;
			break;
			
			case 2: 
			operacao = x - y;
			break;
			
			case 3:
			operacao = x / y;
			break;
			
			case 4:
			operacao = x * y;
			break;
			
		}
		
		//saida
		System.out.println("O resultado é: " + operacao);
		
	}	

}
