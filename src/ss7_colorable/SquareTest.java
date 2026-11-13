package ss7_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(5.0);

        System.out.println("Cạnh hình vuông: " + square.getSide());
        System.out.println("Diện tích: " + square.getArea());
        System.out.println("Chu vi: " + square.getPerimeter());
        square.howToColor();
    }
}
