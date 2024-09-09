package exercicios.aplicacao;

import java.util.Scanner;

import exercicios.entidades.Funcionario;

public class programaFuncionario {
     public static void main(String[] args) {
          //instanciar
          Scanner sc = new Scanner (System.in);
          Funcionario funcionario = new Funcionario(null, null, 0);

          //entrada
          System.out.println("Preencha com Nome, Cargo e Salário");
          funcionario.setNome(sc.nextLine());
          funcionario.setCargo(sc.nextLine());
          funcionario.setSalario(sc.nextDouble());

          //saida
          System.out.println(""); //Pula linha
          System.out.println("Funcionário: " + funcionario.getNome());
          System.out.println("Cargo: " + funcionario.getCargo());
          System.out.println("Salário: " + funcionario.getSalario());
          System.out.println(""); //Pula linha
          System.out.println("Salário com bonificação: " + funcionario.calcularBonificação(funcionario.getSalario()));

          sc.close();
     }
}
