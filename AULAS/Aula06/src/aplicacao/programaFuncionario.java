package aplicacao;

import java.util.Scanner;

import entidades.funcionario;

public class programaFuncionario {
    public static void main(String[] args) {
        //scan
        Scanner sc = new Scanner (System.in);

        //entrada
        System.out.println("Digite abaixo os dados do funcionário:");
        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salário Bruto: ");
        funcionario.salarioBruto = sc.nextInt();
        System.out.println("imposto: ");
        funcionario.imposto = sc.nextInt();

        

        //saida
        System.out.println("Funcionário: " + funcionario.nome + ", R$ " + funcionario.salarioLiquido());

        System.out.println();

        //entrada 2
        System.out.println("Qual a quantidade de aumento? ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalario(porcentagem);

        System.out.println();

        //saida 2
        System.out.println("Atualização: " + funcionario.nome + ", R$" + funcionario.aumentoSalario(porcentagem));

        sc.close();
    }

}
