import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre com um numero N:");
        int N = sc.nextInt();
        double x = 0;
        double z = 0;
        double div = 0;
        for (int i = 0; i< N;i++){
            x = sc.nextInt();
            z = sc.nextInt();
            if (z == 0){
                System.out.println("Divisão impossivel.");
            }else {
                div = x/z;
                System.out.printf("%.1f%n", div);
            }

        }








    }
}