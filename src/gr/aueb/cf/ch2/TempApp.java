package gr.aueb.cf.ch2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Λαμβάνει μια θερμοκρασία από τον χρήστη και εμφανίιζει κατάλληλο μήνυμα
 * εάν η θερμοκρασία είναι κάτω από το μηδέν(0)
 */
public class TempApp {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int temp;
        boolean isBelowZero;

        System.out.println("Παρακαλώ δώστε μία θερμοκρασία σε ακέραιο αριθμό:");
         temp = sc.nextInt();

         isBelowZero = temp<0;

        System.out.printf("Η θερμοκρασία είναι κάτω του μηδενός %b",isBelowZero) ;
    }
}
