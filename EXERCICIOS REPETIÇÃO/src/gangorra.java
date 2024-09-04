import java.util.Scanner;

public class gangorra {
    public static void main(String[] args) {
        //var e scan
        Scanner sc = new Scanner (System.in);

        //entrada
        System.out.println("Digite o PESO 1, COMPRIMENTO 1, PESO 2 e COMPRIMENTO 2: ");
        double p1 = sc.nextDouble();
        double c1 = sc.nextDouble();
        double p2 = sc.nextDouble();
        double c2 = sc.nextDouble();

        sc.close();

        double equilibrio = (p1 * c1) / (p2 * c2);
        //processamento
        if (equilibrio == 1) {
            System.out.println("0");
        } else {
            if (p1 * c1 < p2 * c2) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }
        }
        
           
    }
}
