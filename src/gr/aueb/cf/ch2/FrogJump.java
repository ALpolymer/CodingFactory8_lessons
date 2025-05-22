package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * a small frog wants to go to the other side of the road.
 * The frog is currently at position X and wants to go to position Y.
 * The frog jumps a fixed distance D.
 * The program finds the minimum number of jumps.
 */
public class FrogJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x , y , d;

        int jumps = 0;

        System.out.println("Δώσε την αρχική θέση του βατράχου σε ακέραιο αριθμό:");
        x = sc.nextInt();

        System.out.println("Δώσε την τελική θέση του βατράχου σε ακέραιο αριθμό:");
        y = sc.nextInt();

        System.out.println("Δώσε την απόσταση του άλματος του βατράχου σε ακέραιο αριθμό:");
        d = sc.nextInt();

       jumps = (int) Math.ceil((y-x)/(double)d);

        System.out.printf("Τα άλματα που θα κάνει ο βάτραχος είναι %d" , jumps);
    }
}
