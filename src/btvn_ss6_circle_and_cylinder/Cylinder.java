package btvn_ss6_circle_and_cylinder;

public class Cylinder extends Circle{
    public double height;
    public Cylinder (){
        super();
    }


    public Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getV(){
        return getArea()* height;
    }
    public String toString(){
        return " Ban Kinh: " +getRadius() +"Mau Sac" +getColor() + " Dien tich: " +getArea() +" Chieu cao: " + getHeight() + " The Tich: "+getV();
    }
}
