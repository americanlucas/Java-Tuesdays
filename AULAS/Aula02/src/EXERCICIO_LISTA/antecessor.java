package EXERCICIO_LISTA;

import java.util.Scanner;

public class antecessor {

	public static void main(String[] args) {
		//var e scan
		Scanner leitor = new Scanner (System.in);
		
		int num, suc, ant;

		//entrada
		System.out.print("Digite o numero: ");
		num = leitor.nextInt();
		
		leitor.close();
		
		//processamento
		suc = num + 1;
		ant = num - 1;
		
		//saida
		System.out.println("Sequencia correta: " + ant + ", " + num + " e " + suc);
	}

}
