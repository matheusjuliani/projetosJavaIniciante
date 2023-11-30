import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int g = 0;
        int d = 0;


        System.out.println("Menu:");
        System.out.println("1- Alcool.");
        System.out.println("2- Gasolina.");
        System.out.println("3- Diesel.");
        System.out.println("4 - fim.");
        int tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo == 1){
                a = a + 1;
            }else if (tipo == 2){
                g = g + 1;
            }else if (tipo == 3){
                d = d + 1;
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);



    }
}