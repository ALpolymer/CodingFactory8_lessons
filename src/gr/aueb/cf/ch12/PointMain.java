package gr.aueb.cf.ch12;

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2,3);
        Point p3 = new Point(-2,4);
        Point p4 = new Point(-9,0);
        Point p5 = new Point(-20,42);

        p3.setX(60);
        System.out.println(p3.getX()  + "," + p3.getY());

        System.out.println(Point.getNumberOfPoints());

    }
}
