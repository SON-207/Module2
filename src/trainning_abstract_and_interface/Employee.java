package trainning_abstract_and_interface;

public abstract class Employee {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee (String id, String name, double baseSalary){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void displayInfo(){ // method thuong
        System.out.println("Ma: " +id +" Ten: " +name +" Luong: " +baseSalary);
    }

    public abstract double calculateSalary();// method truu tuong
}
