
public class MovablePoints implements Movable {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public double speed1;
    public double speed2;

    MovablePoints(double a, double b, double x, double y) {
        setX1(a);
        setY1(b);
        setX2(x);
        setY2(y);
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public void moveLeft(double d) {
        setX1(x1 - speed1*d);
        setX2(x2 - speed2*d);
    }

    @Override
    public void moveRight(double d) {
        setX1(x1 + speed1*d);
        setX2(x2 + speed2*d);
    }

    @Override
    public void moveUp(double d) {
        setY1(y1 - speed1*d);
        setY2(y2 - speed2*d);
    }

    @Override
    public void moveDown(double d) {
        setY1(y1 + speed1*d);
        setY2(y2 + speed2*d);
    }

    public boolean checkSpeedEquality() {
        return speed1 == speed2;
    }
}
