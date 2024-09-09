package exercicios.aplicacao;

import java.util.Scanner;

import exercicios.entidades.carro;

public class programaCarro {
     public static void main(String[] args) {
          //scanner
         Scanner sc = new Scanner (System.in);
         carro meuCarro = new carro(0, null, null);

         
         //entrada
          
         meuCarro.setMarca("Toyota");
         meuCarro.setModelo("Corolla");
         meuCarro.setAno(1999);

         sc.close();

         //saida
         System.out.println("DESCRIÇÃO CARRO: ");
         System.out.println("Marca: " + meuCarro.getMarca());
         System.out.println("Modelo: " + meuCarro.getModelo()); 
         System.out.println("Ano: " + meuCarro.getAno());
     }
}
