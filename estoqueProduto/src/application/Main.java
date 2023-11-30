package application;
import entities.Product;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Product p1 = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        p1.setName(sc.nextLine());
        System.out.print("Price: ");
        p1.setPrice(sc.nextDouble());
        System.out.print("Quantity: ");
        p1.setQuantity(sc.nextInt());

        System.out.println();
        System.out.println("Product data: " + p1);

        System.out.print("Enter the number of products to be added in stock: ");
        p1.addProducts(sc.nextInt());
        System.out.println();
        System.out.println("Updated data: "+p1);
        System.out.print("Enter the number of products to be removed from stock:");
        p1.removeProducts(sc.nextInt());
        System.out.println();
        System.out.println("Updated data: "+p1);
    }
}