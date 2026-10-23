package fan;

public class Run {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setOn(true);
        System.out.println(fan.toString());
        fan.runOne();
        System.out.println(fan.toString());
        fan.runTwo();
        System.out.println(fan.toString());
        fan.runThree();
        System.out.println(fan.toString());

        fan.end();
        System.out.println(fan.toString());
    }
}
