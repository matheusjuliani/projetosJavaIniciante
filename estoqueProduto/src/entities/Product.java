package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    //Construtor

    public Product (String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
    }

    //Getters & Setter

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double totalValueInStock(){
        return this.quantity * this.price;
    }
    public void addProducts(int q){
        this.quantity+=q;
    }
    public void removeProducts(int q){
        this.quantity-=q;
    }



    public String toString() {
          return this.name +
                ", $"
                  + String.format("%.2f",this.price)
                  +", " + this.quantity+
                " units, Total: $ " +
                  String.format("%.2f", totalValueInStock())+
                "\n -------------------";

    }
}
