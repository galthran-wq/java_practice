
class Circle extends Shape {
    private double radius;
    private double x;
    private double y;

    Circle(double radius, double x, double y) {
        setRadius(radius);
        setX(x);
        setY(y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        return Math.PI * Math.pow(radius, 2);
    }
}
