import java.util.Scanner;

public class bondinho {

	public static void main(String[] args) {
		// scan e var
		Scanner sc = new Scanner(System.in);

		// entrada
		System.out.println("Digite a quantidade de alunos e monitores: ");
		int a = sc.nextInt();
		int m = sc.nextInt();

		sc.close();

		int total = a + m;
		// pro e saida
		if (total > 50) {
			System.out.print("N");
		} else {
			System.out.print("S");
		}
	}

}
