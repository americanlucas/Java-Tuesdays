import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		// var e scn
		Scanner sc = new Scanner (System.in);

		//entrada
		System.out.println("Digite o numeros de Cino e Bino: ");
		int c = sc.nextInt();
		int b = sc.nextInt();

		int resultado = b + c;

		sc.close();
		//proc e saida
		
		if (resultado%2 == 0) {
			System.out.println("Vencedor: Bino");
		} else {
			System.out.println("Vencedor: Cino");
		}
	}

}
