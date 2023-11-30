import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x =sc.next();
        System.out.println("Você digitou:" + x);
        int y =sc.nextInt();
        System.out.println("Voce digitou: " + y);
        double z = sc.nextDouble();
        System.out.println("Você digitou: " + z);
        char a = sc.next().charAt(0);
        System.out.println("Você digitou: " + a);











    }
}