import java.util.Scanner;

public class zeroOuUm {
    public static void main(String[] args) {
        //scan
        Scanner sc = new Scanner (System.in);

        //Entrada
        System.out.println("ZERO OU UM!");
        System.out.println("Digite o valor escolhido por Alice, Beto e Clarice: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        //processamento
        if (a != b && a != c) {
            System.out.println("ALICE GANHA!");
        } else if (b != a && b != c) {
            System.out.println("BETO GANHA!");
        } else {
            System.out.println("CLARICE GANHA!");
        }
    }
}
