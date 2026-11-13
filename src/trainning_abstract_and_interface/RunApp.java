package trainning_abstract_and_interface;

public class RunApp {
    public static void main(String[] args) {

        FullTimeEmployee emp = new FullTimeEmployee("CXX1", "nguyen van a", 10.000000, 2.000000);
        emp.displayInfo();
        System.out.println("tong luong :" +emp.calculateSalary());
        System.out.println("tong tien thuong :" +emp.calculateBonus());
        System.out.println("Bo Phan PartTime : ");
        PartTimeEmployee emp1 = new PartTimeEmployee("XXX", "Son",0,8,25_000);
        emp1.displayInfoPartTine();
        System.out.println("tong luong: " +emp1.calculateSalary());
    }
}
