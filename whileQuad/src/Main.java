import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int a,b;
        System.out.println("Digite dois numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
     while (a != 0 && b != 0){
         if (a > 0 && b > 0 ){
             System.out.println("Quadrante 1 ");
         }else if (a > 0 && b < 0){
             System.out.println("Quadrante 4");
         }else if (a < 0 && b > 0){
             System.out.println("Quadrante 2");
         }else {
             System.out.println("Quadrante 3");
         }
         System.out.println("Digite novamente: ");
         a = sc.nextInt();
         b = sc.nextInt();
     }










    }
}