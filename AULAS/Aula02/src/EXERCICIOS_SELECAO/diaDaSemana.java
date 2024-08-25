package EXERCICIOS_SELECAO;

import java.util.Scanner;

public class diaDaSemana {

	public static void main(String[] args) {
		// var e scan
		Scanner leitor = new Scanner (System.in);
		
		int x;
		String dia;
		
		//entrada
		System.out.print("Digite um numero correspondente ao dia da semana: ");
		x = leitor.nextInt();
		
		leitor.close();
		
		//processamento 
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
		
		//saida
		System.out.println("O dia da semana é " + dia);
		}
	}

