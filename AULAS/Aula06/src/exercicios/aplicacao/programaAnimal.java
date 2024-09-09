package exercicios.aplicacao;

import java.util.Scanner;

import exercicios.entidades.animal;

public class programaAnimal {
     public static void main(String[] args) {
          //Scan e Instanciar
          Scanner sc = new Scanner (System.in);

          animal animal = new animal();

          //entrada
          System.out.println("Digite o nome do animal: ");
          animal.fazer_som(sc.nextLine());

          sc.close();
     }
}
