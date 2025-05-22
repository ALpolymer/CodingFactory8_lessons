package gr.aueb.cf.ch1;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1+num2;

        System.out.println(num1 + "+" + num2 + "+" + "=" + sum);
    }
}
