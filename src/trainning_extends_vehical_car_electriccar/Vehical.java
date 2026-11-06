package trainning_extends_vehical_car_electriccar;

public class Vehical {
    private String brand;
    private int year;

    public Vehical(String brand, int year){
        this.brand=brand;
        this.year = year;
    }

    public String start(){
        return "Vehical starting";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "Brand: " +getBrand() +"| Year: " +getYear() +"| Start: " +start();
    }
}
