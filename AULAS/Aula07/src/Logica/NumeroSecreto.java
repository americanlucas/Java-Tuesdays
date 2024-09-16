package Logica;

import java.util.Scanner;

public class NumeroSecreto {
     public static void main(String[] args) {
          //scan
          Scanner sc = new Scanner (System.in);

          int num = -1;
          int contador = 0;
          System.out.println("Adivinhe o número");

          //entrada
          while (num != 2018) {
               num = sc.nextInt(); 
               if (num != 0) {
                    contador++;
               }
          }

          //saida
          System.out.println("Você tentou " + contador + " vezes antes de acertar!");

          sc.close();
     }
}
