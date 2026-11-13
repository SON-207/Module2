package trainning_abstract_and_interface;

import first_time_training_static.HocSinh;

public class PartTimeEmployee extends Employee {
    protected int workingHours;
    protected double hourlyRate;

    public PartTimeEmployee (String id, String name, double baseSalary , int workingHours , int hourlyRate){
        super(id,name,0);
        this.hourlyRate= hourlyRate;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return workingHours + hourlyRate;
    }

    public void displayInfoPartTine(){
        System.out.println("Ma : " +id +"| Name: " +name +"| so gio lam viec: " +workingHours +" | luong 1 gio: " +hourlyRate);
    }
}
