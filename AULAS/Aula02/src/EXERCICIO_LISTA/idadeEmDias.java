package EXERCICIO_LISTA;

import java.util.Scanner;

public class idadeEmDias {

	public static void main(String[] args) {
		//var scan
		Scanner leitor = new Scanner (System.in);
		
		int idadeAnos, idadeDias;
		
		//entrada
		System.out.print("Digite sua IDADE para saber quantos dias vividos: ");
		idadeAnos = leitor.nextInt();
		
		leitor.close();
		
		//processamento
		idadeDias = idadeAnos *365;
		
		//saida
		System.out.printf("Sua idade em dias é %d %n", idadeDias);
	}

}
