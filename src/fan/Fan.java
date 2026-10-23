package fan;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int spead = SLOW;
    private boolean on = false;
    private double radious = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSpead() {
        return spead;
    }

    public void setSpead(int spead) {
        this.spead = spead;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.isOn()) {
            return "speed: " + this.spead + " color: " + this.color + " radius: " + this.radious + " Fan is on ";
        }
        return "color: " + this.color + " radius: " + this.radious + " Fan is off";
    }
    public void runOne(){
        this.spead = SLOW;
    }
    public void runTwo(){
        this.spead = MEDIUM;
    }
    public void runThree(){
        this.spead = FAST;
    }
    public void end(){
        this.spead = 0;
        this.on=false;
    }
}
