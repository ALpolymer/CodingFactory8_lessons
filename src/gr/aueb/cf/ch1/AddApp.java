package gr.aueb.cf.ch1;

public class AddApp {
    public static void main(String[] args) {
        long num1 = 2_147_483_647;
        int num2 = 2;
        long result = 0;

        result = num1+num2;

        System.out.printf("Το αποτέλεσμα είναι: %,d ", result);
    }
}
