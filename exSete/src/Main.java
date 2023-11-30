import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um numero N: ");
        int N = sc.nextInt();

        for (int i = 1;i <= N; i++){
            System.out.println(i +" " + (int)Math.pow(i,2) +" " + (int)Math.pow(i,3));

        }






    }
}