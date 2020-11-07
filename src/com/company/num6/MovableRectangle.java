
public class MovableRectangle extends Rectangle implements Movable {

    MovableRectangle(double a, double b, double x, double y) {
        super(a, b, x, y);
    }

    @Override
    public void moveLeft(double d) {
        setX(getX() - d);
    }

    @Override
    public void moveRight(double d) {
        setX(getX() + d);
    }

    @Override
    public void moveUp(double d) {
        setY(getY() - d);
    }

    @Override
    public void moveDown(double d) {
        setY(getY() + d);
    }
}