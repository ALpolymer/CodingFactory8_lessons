package gr.aueb.cf.ch1;

public class MathDemo {
    public static void main(String[] args) {
        int die =  (int)(Math.random()*6);
        System.out.println("Το απόλυτο του -5 είναι: " + Math.abs(-5));
        System.out.println("Το απόλυτο του -5 είναι: " + Math.min(1, 10));
        System.out.println("Το απόλυτο του -5 είναι: " + Math.max(1, 10));
        System.out.println("Τυχαία τιμή: " + die);

    }
}
