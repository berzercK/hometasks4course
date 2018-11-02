package education.homework.task1_OOP.figure;

public class Rectangle extends Figure {
    private float lenght = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (lenght + width);
    }

    @Override
    public double getArea() {
        return lenght * width;
    } //float -> double без потери точности

    @Override
    public String toString() {
        return "Rectangle[" +
                "lenght = " + lenght +
                ", width = " + width +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;
        return rectangle.lenght == lenght && rectangle.width == width;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + Float.floatToIntBits(lenght);
        result = 31 * result + Float.floatToIntBits(width);
        return result;
    }
}
