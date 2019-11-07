package practise.p09;

public class Fan {
    private int speed;
    private boolean on;
    private double radius;

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                '}';
    }
}
