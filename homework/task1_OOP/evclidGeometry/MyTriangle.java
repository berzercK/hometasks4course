package education.homework.task1_OOP.evclidGeometry;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1.setX(v1.getX());
        this.v1.setY(v1.getY());

        this.v2.setX(v2.getX());
        this.v2.setY(v2.getY());

        this.v3.setX(v3.getX());
        this.v3.setY(v3.getY());
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1 = " + v1.toString() +
                ", v2 = " + v2.toString() +
                ", v3 = " + v3.toString() +
                ']';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        //        Equilateral (равносторонний)	Isosceles(равнобедренный)	Scalene(обычный, лестничный)

        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1)) {
            return "Equilateral";
            //можно утверждать, что выражение в первом if никогда не выполниться, так как в классе MyPoint
            //координаты х и у имеют тип int, что не позволяет хранить в них дробные значения,
            //что в свою очередь не даёт хранить координаты равностороннего треугольника:
            // (0,0) (0.5, sqrt(3)/2) (1,0)
        } else if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v1.distance(v3) ||
                v1.distance(v2) == v1.distance(v3)) {
            return "Isosceles";
        } else {
            return "Scalene";
        }

    }

}
