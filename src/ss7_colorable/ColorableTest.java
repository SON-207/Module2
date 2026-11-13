package ss7_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new Square(6.0);

        for (Shape shape : shapes) {
            System.out.println("Hình: " + shape.getClass().getSimpleName());
            System.out.println("Diện tích: " + shape.toString());

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
        }
    }
}
