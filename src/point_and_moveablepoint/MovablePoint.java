package point_and_moveablepoint;

public class MovablePoint extends Point{
    private float xspeed = 0.0f;
    private float yspeed = 0.0f;

    public MovablePoint(){

    }

    public MovablePoint(float x, float y , float xspeed, float yspeed ){
        super(x,y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXSpeed() {
        return xspeed;
    }

    public void setXSpeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYSpeed() {
        return yspeed;
    }

    public void setYSpeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public void setSpeed(float x,float y,float xspeed,float yspeed){
        super.setXY(x,y);
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }

    public float[] getSPeed() {
        return new float[]{getX(), getY(), getXSpeed(), getYSpeed()};
    }

    public MovablePoint move(){
            setX(getX()+xspeed);
            setY(getY()+yspeed);
            return this;
    }

    public String toString(){
        return "(" +getX() +"," +getY() +")" +"," +"speed=" +"(" +getXSpeed() +"," +getYSpeed() +")";
    }
}
