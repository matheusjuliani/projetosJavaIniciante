import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


     Scanner sc = new Scanner(System.in);

        System.out.println("Entre tres numeros;");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int higher = max(x,y,z);

        showResult(higher);



    }

    public static int max(int a,int b,int c){
        int higher;
        if (a > b && a > c){
            higher = a;
        }else if( b > a && b > c){
            higher = b;
        }else {
            higher = c;
        }
        return higher;
    }
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}