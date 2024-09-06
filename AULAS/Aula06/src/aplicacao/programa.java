package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.retangulo;

public class programa {
    public static void main(String[] args) {
        //scan
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        //entrada
        System.out.println("Digite a largura e altura: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        //saida
        System.out.println("A área é " + retangulo.Area());
        System.out.println("O perímetro é " + retangulo.Perimetro());
        System.out.println("A diagonal é " + retangulo.Diagonal());

        sc.close();
    }
}
