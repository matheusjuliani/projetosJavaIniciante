import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int c1,c2,q1,q2;
        double p1,p2,total;

        System.out.println("Digite o codigo da peça: ");
        c1 = sc.nextInt();
        System.out.println("Digite o numero de peças: ");
        q1 = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        p1 =sc.nextDouble();
        System.out.println("Digite o codigo da peça: ");
        c2 = sc.nextInt();
        System.out.println("Digite o numero de peças: ");
        q2 = sc.nextInt();
        System.out.println("Digite o valor da peça: ");
        p2 =sc.nextDouble();
        total = (q1*p1) + (q2*p2);
        System.out.printf("Total a pagar: R$ %.2f",total);







    }
}