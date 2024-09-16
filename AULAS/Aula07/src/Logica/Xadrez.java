package Logica;

import java.util.Scanner;

public class Xadrez {
     public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          int i = 0, j = 0;

          
          System.out.println("Digite a linha e a coluna: ");
          i = sc.nextInt();
          j = sc.nextInt();
          int soma = i + j;

          
          if (soma%2 == 0) {
               System.out.println("1");
          } else {
               System.out.println("0");
          }

          sc.close();

     }
}
