package EXERCICIOS_REPETICAO;

import java.util.Scanner;

public class mediaAritmetica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int i = 0;
        double soma = 0;
        double media;

        // Entrada e processamento
        System.out.println("Digite 5 números (ou 0 para finalizar):");

        while (i < 9) {
            int numero = leitor.nextInt();
            if (numero == 0) {
                break; 
            }
            soma += numero; 
            i++;
        }

        leitor.close();
        
        if (i > 0) {
            media = soma / i; 
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Nenhum número válido foi inserido.");
        }
    }
}