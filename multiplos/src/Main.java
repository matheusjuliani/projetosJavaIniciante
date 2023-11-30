import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,troca;

        do {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a < b) {
                troca = a;
                a = b;
                b = troca;
            }
            if (a % b == 0) {
                System.out.println("São multiplos.");
            } else {
                System.out.println("Não são multiplos.");
            }
        }while (a !=0);







    }
}