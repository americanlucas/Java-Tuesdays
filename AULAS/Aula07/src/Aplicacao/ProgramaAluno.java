package Aplicacao;

import java.util.Scanner;

import Entidades.Aluno;

public class ProgramaAluno {
     public static void main(String[] args) {
          //scan
          Scanner sc = new Scanner (System.in); 
          Aluno aluno = new Aluno(null, 0, 0, 0, 0, 0 );

          //entrada
          System.out.println("Digite o nome e a matrícula: ");
          aluno.setNome(sc.nextLine());
          aluno.setMatricula(sc.nextInt());
          

          System.out.println("Digite as 3 Notas: ");
          aluno.setNota1(sc.nextDouble());
          aluno.setNota2(sc.nextDouble());
          aluno.setNota3(sc.nextDouble());
          aluno.setSoma();

          
          //processamento
          if (aluno.calculoMedia(aluno.setSoma()) >= 7) {
               System.out.println("Aprovado");
          } else {
               System.out.println("Reprovado");
          }

          sc.close();
     }
}
