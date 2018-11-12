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
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        return Math.round(distance * 100000d) / 100000d;
    } //Distance from this point the given point at (x,y)

    public double distance(MyPoint myPoint) {
        double distance = Math.sqrt(Math.pow(x - myPoint.getX(), 2) + Math.pow(y - myPoint.getY(), 2));
        return Math.round(distance * 100000d) / 100000d;
    } //Distance from this point the given instance of MyPoint

    public double distance() {
        return Math.sqrt(x * x + y * y);
    } //Distance from this point to (0;0)

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyPoint)) return false;

        MyPoint myPoint = (MyPoint) o;
        return myPoint.x == x && myPoint.y == y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long bitsX = Double.doubleToLongBits(x);
        long bitsY = Double.doubleToLongBits(y);

        result = 31 * result + (int) (bitsX ^ (bitsX >>> 32));
        result = 31 * result + (int) (bitsY ^ (bitsY >>> 32));
        return result;
    }

}
