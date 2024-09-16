package Logica;

import java.util.Scanner;

public class Morango {
     public static void main(String[] args) {
          //scan
          Scanner sc = new Scanner(System.in);
          

          //entrada
          System.out.println("Digite o comprimento e largura do Terreno 1 e do Terreno 2, respectivamente: ");
          double c1 = sc.nextDouble();
          double l1 = sc.nextDouble();
          double c2 = sc.nextDouble();
          double l2 = sc.nextDouble();
          
          double terreno1 = l1 * c1;
          double terreno2 = l2 * c2;

          if (terreno1  > terreno2) {
               System.out.println("Terreno 1 é mais adequado para plantação!");
          } else {
               System.out.println("Terreno 2 é mais adequado para plantação!");
          }
          sc.close();
     }
}
