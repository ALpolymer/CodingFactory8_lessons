package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογἠ με τη χρήση μεθόδων
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            printMenu();
            choice = scanner.nextInt();
            switch(choice){
                case 1 -> System.out.println("Επιτυχής Εισααγωγή");
                case 2 -> System.out.println("Επιτυχής Διαγραφή");
                case 3 -> System.out.println("Επιτυχής Ενημέρωση");
                case 4 -> System.out.println("Επιτυχής Αναζήτηση");
                case 5 -> System.out.println("Επιτυχής Έξοδος");
                default -> System.out.println("Λάθος επιλογή");
            }
        } while (choice != 5);
    }


    public static void printMenu (){
        System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Εισααγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }
}
