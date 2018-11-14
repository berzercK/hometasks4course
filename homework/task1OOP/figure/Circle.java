package education.homework.task1OOP.figure;

        /*
         * Здесь нужно реализовать логику метода getArea() для вычисления площади круга.
         * В качестве числа pi использовать статическую переменную класса Math.PI
         */

public class Circle extends Figure {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius = " + radius +
                ", color = " + color +
                ']';
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;
        return circle.radius == radius && circle.color.equals(color);
    }

    @Override
    public int hashCode() {
        int result = 17;
        long bits = Double.doubleToLongBits(radius);

        result = 31 * result + (int) (bits ^ (bits >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }

}
