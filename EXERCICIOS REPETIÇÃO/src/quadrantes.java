import java.util.Scanner;

public class quadrantes {
    public static void main(String[] args) {
        //scan
        Scanner sc = new Scanner (System.in);

        //entrada
        System.out.println("Digite o valor de x e y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        //proc
        if (x == 0 && y == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x == 0) {
            System.out.println("Marco 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
           System.out.println("Q4"); 
        }
        
        
    }
}
