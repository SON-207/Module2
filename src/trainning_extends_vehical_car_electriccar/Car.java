package trainning_extends_vehical_car_electriccar;

public class Car extends Vehical{
    private int numDoors;

    public Car(String brand, int year,int numDoors){
        super(brand,year);
        this.numDoors=numDoors;
    }

    public String start(){
        super.start();
        return super.start() +"Car starting";
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
    public String toString(){
        return "Brand: " +getBrand() +"| Year: " +getYear() +"| Start: " +start() +"| NumDoors: " +numDoors;
    }
}
