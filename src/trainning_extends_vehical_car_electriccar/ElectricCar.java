package trainning_extends_vehical_car_electriccar;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String brand, int year, int numDoors,int batteryCapacity){
        super(brand, year, numDoors);
        this.batteryCapacity=batteryCapacity;
    }

    public String start(){
        super.start();
        return super.start() +"-> Electric mode On";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String toString(){
        return "Brand: " +getBrand() +"| Year: " +getYear() +"| Start: " +start() +"| NumDoors: " +getNumDoors() +"| Battery: " +getBatteryCapacity();
    }
}
