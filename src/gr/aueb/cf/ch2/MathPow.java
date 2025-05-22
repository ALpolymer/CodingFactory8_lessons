package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει το τετράγωνο και τον κύβο ενός αριθμού που εισάγει ο χρήστης.
 * Χρησιμοποιεί την μέθοδο Math.pow της κλάσης Math.
 * @author A.Polymeros
 */
public class MathPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Παρακαλώ δώστε εναν αριθμό:");
        num = sc.nextInt();

        System.out.printf("Square %d, Cube %d" , (int)Math.pow(num ,2), (int)Math.pow(num ,3));
    }
}
