package education.homework.task2__OOP2.moving;

public class MoveTests {
    public static void main(String[] args) {
        Ball ball = new Ball(30, 30, 5, 10, 10);
        Container container = new Container(0, 0, 40, 60);

        System.out.println(ball.toString());
        System.out.println(container.toString() + '\n');

        for (int i = 0; i < 50; i++) {
            ball.move();
            System.out.println(ball.toString());
            System.out.println("Inside? - " + (container.collides(ball) ? "Yes" : "No") + '\n');

            if (!container.collides(ball)) {
                ball.reflectHorizontal();
                ball.reflectVerticla();
            }
        }
    }
}
