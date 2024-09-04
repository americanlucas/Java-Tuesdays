import java.util.Scanner;

public class garcom {
    public static void main(String[] args) {
        //var e scan
        Scanner sc = new Scanner (System.in);
        int lata = 0,copo = 0;

        
        //entrada
        System.out.println("Digite o valor de bandejas: ");
        int bandeja = sc.nextInt();
        
        //processamento
        for (int i = 1; i <= bandeja; i++) {
            System.out.println("Digite o número de latas e copos: ");
            lata = sc.nextInt();
            copo = sc.nextInt();

            if (lata > copo) {
                System.out.println(copo);
                break;
            } else {
                continue;
            }
        }

        sc.close();
    }
}
