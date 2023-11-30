package register;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    //Construtores
    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public Employee() {
    }
    //Metodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary(){
        return getGrossSalary() - tax;
    }
    public void increaseSalary(double a){
        setGrossSalary(getGrossSalary() + (getGrossSalary() * (a/100)));

    }
    public void status(){
        System.out.println(netSalary());
    }
}
