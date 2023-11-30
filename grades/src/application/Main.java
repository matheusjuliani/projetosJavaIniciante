package application;
import entities.Student;

import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student s1 = new Student();
        System.out.print("Name: ");
        s1.setName(sc.nextLine());
        System.out.println("Digite as notas: ");
        s1.setGrade1(sc.nextDouble());
        s1.setGrade2(sc.nextDouble());
        s1.setGrade3(sc.nextDouble());

        s1.finalGrade();
        s1.missingPoints();
        System.out.printf("Final grade: %.2f%n",s1.finalGrade());
        System.out.println();
        if (s1.missingPoints() > 0){
            System.out.printf("Missing points: %.2f%n",s1.missingPoints());
        }else {
            System.out.println("Pass");
        }
    }
}