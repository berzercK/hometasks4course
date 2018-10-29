package education.homework.task2__OOP2.moving;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x + width;
        y2 = y + height;
    }

    public boolean collides(Ball ball) {

        return (!(ball.getX() + ball.getRadius() > x2)) && (!(ball.getX() - ball.getRadius() < x1)) &&
                (!(ball.getY() + ball.getRadius() > y2)) && (!(ball.getX() - ball.getRadius() < y1));
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + ',' + y1 + "),(" +
                +x2 + ',' + y2 + ")]";
    }
}

/*
        return (ball.getX() + ball.getRadius() > x2) || (ball.getX() - ball.getRadius() < x1) ||
                (ball.getY() + ball.getRadius() > y2) || (ball.getX() - ball.getRadius() < y1) ? false : true;
        return (!(ball.getX() + ball.getRadius() > x2)) && (!(ball.getX() - ball.getRadius() < x1)) &&
                (!(ball.getY() + ball.getRadius() > y2)) && (!(ball.getX() - ball.getRadius() < y1));
    }*/
