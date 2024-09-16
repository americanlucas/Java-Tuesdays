package Logica;

import java.util.Scanner;

public class CoralVerdadeira {
     public static void main(String[] args) {
          //scan
          Scanner sc = new Scanner (System.in);
          int a = 5;
          int b = 3;
          int c = 9;
          int d = 3;

          //entrada
          System.out.println("Digite 4 números: ");
          int w = sc.nextInt();
          int x = sc.nextInt();
          int y = sc.nextInt();
          int z = sc.nextInt();

          //proc
          if (w == a && x == b && y == c && z == d) {
               System.out.println("Coral Verdadeira!");
          } else {
               System.out.println("Coral Falsa!");
          }

          sc.close();
     }
}
