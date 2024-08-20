package A01;

import java.util.Scanner;

public class salarioFuncionario {

	public static void main(String[] args) {
		//var
		Scanner leitor = new Scanner(System.in);
		
		int id;
		int horas;
		double valorPorHora;
		double salario;
		
		//entrada
		System.out.print("Digite seu número de identificação: ");
		id = leitor.nextInt();
		System.out.print("Digite o número de horas trabalhadas: ");
		horas = leitor.nextInt();
		System.out.print("Digite o valor recebido por hora: ");
		valorPorHora = leitor.nextDouble();
		
		leitor.close();
		
		//processamento
		salario = (horas * valorPorHora);
		
		//saida
		System.out.println("Numero de Funcionario: " + id);
		System.out.println("Seu salario é: " + salario);
	}

}
