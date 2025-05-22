package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FactorialApp
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int i = 1;
        int facto = 1;

        System.out.println("Παρακαλώ δώστε εναν αριθμό:");
        number = sc.nextInt();


        while (i <= number){
            facto = facto * i;
            i++;
        }

        System.out.println("Το παραγοντικό του " + number + " είναι: " + facto);
    }
}
