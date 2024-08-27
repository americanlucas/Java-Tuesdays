package A03;

import java.util.Scanner;

public class diaSemana {
	
	//processamento
	public static String swiss (int x, String dia) {
		switch (x) {
		case 1:
		dia = "Segunda";
		break;
		
		case 2: 
		dia = "Terça";
		break;
		
		case 3:
		dia = "Quarta";
		break;
		
		case 4: 
		dia = "Quinta";
		break;
		
		case 5: 
		dia = "Sexta";
		break;
		
		case 6: 
		dia = "Sábado";
		break;
		
		case 7: 
		dia = "Domingo";
		break;
		
		default: 
		dia = "inválido";
		break;
		}
		
		return dia;
	}

	public static void main(String[] args) {
		// var e scan
		Scanner sc = new Scanner (System.in);
		String dia = "dia";
		
		//entrada
		System.out.print("Digite o número da semana: ");
		int num = sc.nextInt();
		
		//saida
		swiss(num, dia);
	}

}
