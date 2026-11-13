package trainning_abstract_and_interface;

public class FullTimeEmployee extends Employee implements BonusEligible {
    private double allowance ;

    public FullTimeEmployee (String id, String name, double baseSalary, double allowance){
        super(id,name,baseSalary);
        this.allowance=allowance;
    }

    @Override
    public double calculateSalary() {
        double A = baseSalary + allowance;
        return A;
    }

    @Override
    public double calculateBonus() {
        double A1 = baseSalary * 0.1;
        return A1;
    }
}
