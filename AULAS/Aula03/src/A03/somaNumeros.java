package A03;

import java.util.Scanner;

//processamento
public class somaNumeros {

	public static int somarNumeros(int num, int b, int c) {
		int soma = num + b + c;
		return soma;
	}
	
	
	
	
	public static void main(String[] args) {
		//var e scan
		Scanner sc = new Scanner (System.in);
		
		//entrada
		System.out.print("Digite os valores: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int x = somarNumeros(a,b,c);
		
		System.out.print("O resultado é: " + x);
	}

}
