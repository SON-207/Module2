package btvn_ss5_access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("circle1 - radius: " +circle1.getRadius());
        System.out.println("circle1 - area: " +circle1.getArea());
        Circle circle2 = new Circle(12.0);
        System.out.println("circle2 - radius: " +circle2.getRadius());
        System.out.println("circle2 - area: " +circle2.getArea());

    }
}
