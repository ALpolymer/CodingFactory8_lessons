package gr.aueb.cf.ch4;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power =0;
        int result = 1;

        System.out.println("Παρακάλώ δώστε 2 ακεραίους:");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 1; i <= power ; i++) {
            result *= base;
        }

        System.out.printf("%d^%d = %d" , base , power ,result);
    }
}
