package EXERCICIO_01;

import java.util.Locale;
import java.util.Scanner;

public class diferençaDeVariaveis {

	public static void main(String[] args) {
		//var e scanner
		Scanner leitor = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int A;
		int B;
		int C;
		int D;
		
		int diferenca;
		
		//entrada
		A = 5;
		B = 6;
		C = 7;
		D = 8;
		
		//processamento
		diferenca = (A * B - C * D);
		
		//Saida
		System.out.printf("Diferença: %d", diferenca);
	}

}
