package gr.aueb.cf.ch5;

/**
 * Αμοιβαία ανταλλαγή των τιμών δύο μεταβλητών.
 * Για παράδειγμα αν a=5 kai b=10
 * να γίνει a=10 και b=5
 */
public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a = %d , b = %d",a ,b);
        swap(a, b);
        System.out.printf("a = %d , b = %d",a ,b);
    }

    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
