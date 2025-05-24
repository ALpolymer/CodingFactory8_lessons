package gr.aueb.cf.ch14;


public class Main {
    public static void main(String[] args) {
        Point p1 = Point.getInstance();//calling Factory Method
        Point p2  = Point.getRandomInstance();//calling Factory Method

        System.out.println(p2.getX());

        /*
         Δείχνουν μόνο μία θέση στο heap και είναι stateless
         */
        CodingFactory cf1 = CodingFactory.getInstance();//Singleton
        CodingFactory cf2 = CodingFactory.getInstance();//Singleton

        cf1.sayHelloToInstance();//non static
        CodingFactory.sayHelloToClass();//static
    }
}
