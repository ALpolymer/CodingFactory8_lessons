package gr.aueb.cf.ch14;

public class Main {
    public static void main(String[] args) {
        Point p1 = Point.getInstance();
        Point p2  = Point.getRandomInstance();

        System.out.println(p2.getX());
    }
}
