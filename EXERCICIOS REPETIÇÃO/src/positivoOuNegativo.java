import java.util.Scanner;

public class positivoOuNegativo {
	public static void main(String args[]) {
		// var e scan
		Scanner sc = new Scanner(System.in);

		// entrada
		System.out.print("Digite o valor: ");
		int x = sc.nextInt();

		sc.close();

		// processamento e saida
		if (x < 0) {
			System.out.print("O valor é Negativo!");
		} else if (x > 0) {
			System.out.print("O valor é Positivo!");
		} else {
			System.out.print("O valor é Nulo!");
		}
	}
}
