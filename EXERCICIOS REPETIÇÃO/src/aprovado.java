import java.util.Scanner;

public class aprovado {
    public static void main(String[] args) {
        //var e scan
        Scanner sc = new Scanner (System.in);

        //entrada
        System.out.println("Digite as DUAS NOTAS: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int media = (n1 + n2) / 2;

        sc.close();
        //processamento 
        if (media >= 7) {
            System.out.println("APROVADO!");
        } else if (media >= 4) {
            System.out.println("RECUPERAÇÃO!");
        } else {
            System.out.println("REPROVADO!");
        }
    }
}
