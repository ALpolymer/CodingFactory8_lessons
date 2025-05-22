package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός υπολογιστής με μεθόδους
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;

        while(true){
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή.Η επιλογή πρέπει να είναι από 1-6");
                continue;
            }

            if (choice == 6){
                System.out.println("Έξοδος...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Το αποτέλεσμα είναι:" + result);
        }
    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static boolean isChoiceValid(int choice){
        return choice>=1 && choice<=6;
    }

    public static int getOneInt(){
        return scanner.nextInt();
    }

    public static int getResultOnChoice(int choice){
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = getOneInt();
        num2 = getOneInt();


        switch (choice){
            case 1 -> result = add(num1, num2);
            case 2 -> result = sub(num1, num2);
            case 3 -> result = mul(num1, num2);
            case 4 -> result = div(num1, num2);
            case 5 -> result = mod(num1, num2);
            default -> System.out.println("Λάθος επιλογή");
       }

       return result;
    }

   public static int add(int num1 ,int num2){
        return num1 + num2;
   }


    public static int sub(int num1 ,int num2){
        return num1 - num2;
    }


    public static int mul(int num1 ,int num2){
        return num1 * num2;
    }


    public static int div(int num1 ,int num2){
        return num1 / num2;
    }


    public static int mod(int num1 ,int num2){
        return num1 % num2;
    }
}
