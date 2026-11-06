package trainning_extends_vehical_car_electriccar;

public class RunApp {
    public static void main(String[] args) {
        ElectricCar lambo = new ElectricCar("lamboghini", 2020, 2, 90);
        System.out.println(lambo.toString());
        System.out.println(lambo.start());
    }
}
