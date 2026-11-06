package point_and_moveablepoint;

public class RunApp {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("Mac dinh Point: " + point.toString());

        Point point1 = new Point(1.0f, 2.5f);
        System.out.println("Co tham so: " +point1.toString());

        float[] arrP = point1.getXY();
        System.out.println("Mang x,y: " +"[" +arrP[0] +"]" +"[" +arrP[1] +"]");

        MovablePoint m = new MovablePoint();
        System.out.println("Mac dinh Point: " + m.toString());

        MovablePoint m1 = new MovablePoint(1.0f, 2.5f,5.0f,3.0f);
        System.out.println("Co tham so: " +m1.toString());

        float[] arrM = m1.getSPeed();
        System.out.println("Mang x,y: " +"[" +arrM[0] +"]" +"[" +arrM[1] +"]" +"[" +arrM[2] +"]" +"[" +arrM[3] +"]");

        MovablePoint m2 = new MovablePoint(1.0f, 2.5f,6.0f,3.0f);
        System.out.println("x y =" +m2.move());

    }
}
