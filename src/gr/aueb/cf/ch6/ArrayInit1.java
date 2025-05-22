package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση απλού πίνακα στην JAVA
 */
public class ArrayInit1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 8;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;

        System.out.println("First Element: " + arr[0]);
        System.out.println("Array length: " + arr.length);
       System.out.println("Last element: " + arr[arr.length - 1]);
    }
}
