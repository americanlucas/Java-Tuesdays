package EXERCICIO_LISTA;

import java.util.Scanner;

public class salarioFuncionario {

	public static void main(String[] args) {
		// var scan
		Scanner leitor = new Scanner (System.in);
		
		int salario;
		
		//entrada
		
		System.out.print("Digite o seu salário: ");
		salario = leitor.nextInt();
		
		leitor.close();
		
		//processamento 
		salario *= 1.15 ;
		
		//saida
		System.out.println("O seu novo salário é: " + salario);
	}

}
