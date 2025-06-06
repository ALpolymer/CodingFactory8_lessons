package gr.aueb.cf.ch16;

public class Circle  extends AbstractShape{
    private double radius;

    Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
