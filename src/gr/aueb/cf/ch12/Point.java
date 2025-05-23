package gr.aueb.cf.ch12;

public class Point {
    private int x;
    private int y;
    private static int numberOfPoints; //Ένα static πεδίο ανήκει στην κλάση και όχι στα instances

    public Point(){
        numberOfPoints++;//Ως static πεδίο θα μετράει κάθε δημιουργία instance
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        numberOfPoints++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getNumberOfPoints() {
        return numberOfPoints;
    }

    public static void setNumberOfPoints(int numberOfPoints) {
        Point.numberOfPoints = numberOfPoints;
    }
}


