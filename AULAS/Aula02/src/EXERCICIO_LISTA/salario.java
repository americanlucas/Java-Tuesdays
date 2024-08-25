package EXERCICIO_LISTA;

import java.util.Scanner;

public class salario {


		public static void main(String[] args) {
			//var
			Scanner leitor = new Scanner(System.in);
			
			int horas;
			double valorPorHora;
			double salario;
			
			//entrada
			System.out.print("Digite o número de horas trabalhadas: ");
			horas = leitor.nextInt();
			System.out.print("Digite o valor recebido por hora: ");
			valorPorHora = leitor.nextDouble();
			
			leitor.close();
			
			//processamento
			salario = (horas * valorPorHora);
			
			//saida
			System.out.println("Seu salario é: " + salario);
		}

	}


