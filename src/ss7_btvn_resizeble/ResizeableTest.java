package ss7_btvn_resizeble;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
        Random rand = new Random();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Square(3.0);

        System.out.println("=== TRƯỚC KHI RESIZE ===");
        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.printf("  Diện tích: %.2f%n", shape.getArea());
        }

        System.out.println("\n=== SAU KHI RESIZE ===");
        for (Shape shape : shapes) {
            double percent = 1 + rand.nextInt(100); // 1..100
            System.out.println("\n--- " + shape.getClass().getSimpleName() + " ---");
            System.out.println("Tỷ lệ tăng: " + percent + "%");
            System.out.printf("Diện tích trước: %.2f%n", shape.getArea());

            // Gọi resize qua interface
            if (shape instanceof Resizeable) {
                ((Resizeable) shape).resize(percent);
            }

            System.out.println("Sau khi resize: " + shape);
            System.out.printf("Diện tích sau: %.2f%n", shape.getArea());
        }
    }
}