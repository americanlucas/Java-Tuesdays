package EXERCICIOS_REPETICAO;

import java.util.Scanner;

public class maiorInteiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int numero;
        int maior = Integer.MIN_VALUE;
        
        System.out.println("Digite vários números inteiros (0 para finalizar):");

        while (true) {
            numero = leitor.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        leitor.close();

        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado foi: " + maior);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
    }
}
