package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει αν βρέχει και τη θερμοκρασία
 * και το προγραμμα αποφασίζει αν χιονίζει με βάση
 * τη λογική συνθήκη πως χιονίζει αν και βρέχει και
 * αν η θερμοκρασία είναι < 0.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
         int temp;
         boolean isRaining;
         boolean isSnowing;

        System.out.println("Παράκαλώ εισάγετε τη θερμοκρασία σε ακέραιους βαθμούς Κελσίου:");
        temp = sc.nextInt();

        System.out.println("Παράκαλώ εισάγετε με true ή false αν βρέχει:");
        isRaining = sc.nextBoolean();

        isSnowing = isRaining && temp<0;

        System.out.printf("Χιονίζει %b",isSnowing);
    }
}
