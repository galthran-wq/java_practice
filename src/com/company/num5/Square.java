
public class Square extends Shape {
    private double a;
    private double x;
    private double y;

    Square(double a, double b, double x, double y) {
        setA(a);
        setX(x);
        setY(y);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    double calcArea() {
        return a * a;
    }
}
