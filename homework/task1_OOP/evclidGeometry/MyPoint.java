package education.homework.task1_OOP.evclidGeometry;

/*
 * В данном задании вспоминаем формулу вычисления расстояния между двумя точками на плоскости.
 * Для вычислений потребуется использовать метод Math.sqrt
 */

public class MyPoint {
    private double x; //=0
    private double y; //=0

    public MyPoint() {
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
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

    public double[] getXY() {
        return new double[]{x, y};
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                ',' + y + ')';
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    } //Distance from this point the given point at (x,y)

    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(this.x - myPoint.getX(), 2) + Math.pow(this.y - myPoint.getY(), 2));
    } //Distance from this point the given instance of MyPoint

    public double distance() {
        return Math.sqrt(x * x + y * y);
    } //Distance from this point to (0;0)

}
