package A03;

import java.util.Scanner;

public class valorInteiro {

    public static void verificarMultiploDeDois(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é múltiplo de 2.");
        } else {
            System.out.println(numero + " não é múltiplo de 2.");
        }
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	System.out.print("Digite um número: ");
        int numero = sc.nextInt(); // Substitua por qualquer número que você quiser testar
        verificarMultiploDeDois(numero);
    }
	
		
	
}

