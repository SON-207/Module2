package quadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //getter va setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //Tra ve delta
    public double getDiscriminant() {
        double delta = (b * 2 - 4 * a * c);
        return delta;
    }

    //root1 va root2
    public double geRoot1() {
        double r1 = (-b + Math.sqrt(b * 2 - 4 * a * c)) / (2 * a);
        return r1;
    }

    public double geRoot2() {
        double r2 = (-b - Math.sqrt(b * 2 - 4 * a * c)) / (2 * a);
        return r2;
    }

    public void giaiPT() {
        if (getDiscriminant() >0) {
            System.out.println("Delta > 0 thi PT co 2 nghiem phan biet");
            System.out.println("x1 = " + geRoot1());
            System.out.println("x2 = " + geRoot2());

        } else if (getDiscriminant() == 0) {
            System.out.println("Delta = 0 thi PT co nghiem kep");
            System.out.println("x1 = " + geRoot1());
        } else {
            System.out.println("Phuong Trinh Vo nghiem");
        }
    }


}

