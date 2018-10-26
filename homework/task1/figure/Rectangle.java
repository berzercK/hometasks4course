package education.homework.task1.figure;

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

}
