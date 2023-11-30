import register.Employee;
import java.util.Scanner;
import java.util.Locale;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Employee e1 = new Employee();

        System.out.print("Name: ");
        e1.setName(sc.nextLine());
        System.out.print("Gross Salary: ");
        e1.setGrossSalary(sc.nextDouble());
        System.out.print("Tax: ");
        e1.setTax(sc.nextDouble());

        e1.increaseSalary(10.0);
        e1.status();







    }
}