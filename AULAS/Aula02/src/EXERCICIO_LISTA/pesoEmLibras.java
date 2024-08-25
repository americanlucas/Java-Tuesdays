package EXERCICIO_LISTA;

import java.util.Scanner;

public class pesoEmLibras {

	public static void main(String[] args) {
		//var e scan
		Scanner leitor = new Scanner (System.in);
		
		double kg, lb;

		//entrada
		System.out.print("Digite o seu peso em kg: ");
		kg = leitor.nextDouble();
		
		leitor.close();
		
		//processamento
		lb = kg *2.204;
		
		//saida
		System.out.printf("Seu peso em lb é: %.3f %n", lb);
	}

}
