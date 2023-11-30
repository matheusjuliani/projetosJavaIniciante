import entities.Triangulos;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangulos t1 = new Triangulos();
        Triangulos t2 = new Triangulos();

        System.out.println("Digite os lados do triangulo x.");
        t1.setA(sc.nextDouble());
        t1.setB(sc.nextDouble());
        t1.setC(sc.nextDouble());
        System.out.println("Digite os lados do triangulo y.");
        t2.setA(sc.nextDouble());
        t2.setB(sc.nextDouble());
        t2.setC(sc.nextDouble());
        double areax = t1.area(t1.getA(),t1.getB(),t1.getC());
        System.out.printf("AREA DO TRIANGULO X = %.4f%n",areax);
        double areay = t2.area(t2.getA(),t2.getB(),t2.getC());
        System.out.printf("AREA DO TRIANGULO Y = %.4f%n",areay);
        maior(areax,areay);





    }

    public static void maior(double a,double b) {
        if(a > b){
            System.out.println("Triangulo de maior area é X");
        }else if (a < b){
            System.out.println("Triangulo de maior area é Y");

        }else{
            System.out.println("Triangulos de areas iguais.");
        }


    }


}