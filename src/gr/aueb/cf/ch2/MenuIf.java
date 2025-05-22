package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MenuIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(true){
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. 'Εξοδος");

            choice = sc.nextInt();

            if(choice < 1 || choice > 5){
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if(choice == 5){
                System.out.println("Ευχαριστύμε");
                break;
            }

            if(choice == 1){
                System.out.println("Η εισαγωγή έγινε επιτυχώς");
            } else if(choice == 2){
                System.out.println("Η εισαγωγή έγινε επιτυχώς");
            }else if(choice == 3){
                System.out.println("Η διαγραφή έγινε επιτυχώς");
            } else{
                System.out.println("Η αναζήτηαη έγινε επιτυχώς");
            }
        }
    }
}
