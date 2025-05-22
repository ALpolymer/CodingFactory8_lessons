package gr.aueb.cf.ch7;
import java.util.Scanner;

public class StringParseInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String s;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο:");
        s = scanner.nextLine();

        System.out.println(s);
        System.out.println("type:" + s.getClass().getSimpleName());

        num  = Integer.parseInt(s);

        System.out.println(num + "\n type: num");



    }


}
