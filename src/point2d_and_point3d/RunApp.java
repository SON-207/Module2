package point2d_and_point3d;

public class RunApp {
    public static void main(String[] args) {
        Point2D p2 = new Point2D();
        System.out.println("MAC DINH P2: "+p2.toString());

        Point2D p21 = new Point2D(2.0f,3.9f);
        System.out.println("Co tham so moi P2: " +p21.toString());

        float[] arrP2 = p2.getXY();
        System.out.println("Mang x,y = " +"[" +arrP2[0] +"]" +"[" +arrP2[1] +"]");

        float[] arrP21 = p21.getXY();
        System.out.println("Mang x,y = " +"[" +arrP21[0] +"]" +"[" +arrP21[1] +"]");


        Point3D p3 = new Point3D();
        System.out.println("Mac dinh P3: " +p3.toString());

        Point3D p31 = new Point3D(5.0f,2.0f,6.0f);
        System.out.println("co tham so P3" +p31.toString());

        float[] arrP3 = p31.getXYZ();
        System.out.println("Mang XYZ = " +"[" +arrP3[0] +"]" +"[" +arrP3[1] +"]" +"[" +arrP3[2] +"]" );



    }
}
