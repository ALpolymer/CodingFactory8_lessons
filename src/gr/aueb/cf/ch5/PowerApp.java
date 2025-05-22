package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int exponent = 0;

        System.out.println("Παρακαλώ δώστε τη βάση και τον εκθέτη της δύναμης:");
        base = scanner.nextInt();
        exponent = scanner.nextInt();

        System.out.printf("%d ^ %d = %d" ,base, exponent , power(base , exponent));
    }

    public static int power(int base , int exponent){
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }
}
