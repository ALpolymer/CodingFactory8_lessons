package gr.aueb.cf.ch1;

import java.util.Scanner;

public class EurosApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputEuros;
        int euros500, euros100, euros50, euros20, euros10, euros5;
        int remainingEuros;

        System.out.println("Please insert an amount in Euros");
        inputEuros = in.nextInt();

        remainingEuros = inputEuros;

        euros500 = remainingEuros/500;
        remainingEuros = remainingEuros%500;

        System.out.printf("Total: %d\t 500e: %d\t remaining: %d",inputEuros, euros500, remainingEuros);
    }
}
