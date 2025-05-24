package gr.aueb.cf.ch14;

/**
 * Singleton Design Pattern
 */
public class CodingFactory {
    private static final CodingFactory INSTANCE = new CodingFactory();

    private CodingFactory(){

    }

    public static CodingFactory getInstance(){
        return INSTANCE;
    }

    public static void sayHelloToClass(){
        System.out.println("Hello Class!");
    }

    public void sayHelloToInstance(){
        System.out.println("Hello Instance!");
    }
}
