package education.homework.task1.evclidGeometry;

/*
 * В данном задании вспоминаем формулу вычисления расстояния между двумя точками на плоскости.
 * Для вычислений потребуется использовать метод Math.sqrt
 */

public class MyPoint {
    private int x; //=0
    private int y; //=0

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +
                ',' + y + ')';
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    } //Distance from this point the given point at (x,y)

    public double distance(MyPoint myPoint) {
        return Math.sqrt(Math.pow(this.x - myPoint.getX(), 2) + Math.pow(this.y - myPoint.getY(), 2));
    } //Distance from this point the given instance of MyPoint

    public double distance() {
        return Math.sqrt(x * x + y * y);
    } //Distance from this point to (0;0)

}
