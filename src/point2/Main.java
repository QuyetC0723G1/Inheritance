package point2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5,5);
//        System.out.println(point);


        MovablePoint movablePoint = new MovablePoint();
//        System.out.println(movablePoint);

        MovablePoint movablePoint1 = new MovablePoint(4,6);
//        System.out.println(movablePoint1);
        System.out.println(movablePoint1.move());


        MovablePoint movablePoint2 = new MovablePoint(4,5,6,7);
//        System.out.println(movablePoint2);
        System.out.println(movablePoint2.move());

    }
}
