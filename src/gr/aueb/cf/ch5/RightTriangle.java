package gr.aueb.cf.ch5;
import java.util.Scanner;
/**
 * Ο χρἠστης εισάγει τρεις αριθμούς που ανπαριστούν τις πλευρές
 * ενός ορθογωνίου τριγώνου εστω a η υποτείνουσα και b,c οι δύο
 * κάθετες πλευρές του τριγώνου.
 * Το πρόγραμμα ελέγχει αν το τρίγωνο είναι ορθογώνιο.
 */
public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Παράκαλώ εισάγετε τα a, b, c (α:υποτείνουσα)");
        a =scanner.nextDouble();
        b =scanner.nextDouble();
        c =scanner.nextDouble();

        isRight = Math.abs(a*a - (b*b + c*c)) < EPSILON;

        System.out.println("Το τρίγωνο είναι ορθογώνιο:" + isRight);
    }
}
