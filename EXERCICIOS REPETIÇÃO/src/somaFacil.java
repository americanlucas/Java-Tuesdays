import java.util.Scanner;

public class somaFacil {

	public static void main(String[] args) {
		// scan e var
		Scanner sc = new Scanner(System.in);

		int a, b;

		// entrada
		System.out.println("Digite o valor de A e B: ");
		a = sc.nextInt();
		b = sc.nextInt();

		sc.close();

		// processamento
		int soma = a + b;

		// saida
		System.out.println(soma);
	}

}
