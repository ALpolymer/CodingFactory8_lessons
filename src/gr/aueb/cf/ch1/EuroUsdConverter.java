package gr.aueb.cf.ch1;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inputEuros;
        final double PARITY = 1.103;
        double usaDollars;

        System.out.println("Please insert an amount in Euros");
        inputEuros = in.nextDouble();

        usaDollars = inputEuros*PARITY;

        System.out.printf("%f euros = %f dollars" , inputEuros , usaDollars);
    }
}
