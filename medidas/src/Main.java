import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a,b,c;
        double at,ac,atp,aq,ar;
        double pi = 3.14159;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        at = (a*c)/2;
        ac = pi* Math.pow(c,2);
        atp = (a+b)*c/2;
        aq = Math.pow(b,2);
        ar = a*b;

        System.out.printf("Triangulo = %.3f%n",at);
        System.out.printf("Circulo = %.3f%n",ac);
        System.out.printf("Trapezio = %.3f%n",atp);
        System.out.printf("Quadrado = %.3f%n",aq);
        System.out.printf("Retangulo = %.3f%n",ar);
    }
}