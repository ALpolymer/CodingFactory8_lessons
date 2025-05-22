package gr.aueb.cf.ch5;

/**
 * Δηλώσεις και παραστἀσεις double και float
 */
public class FloatDoubleExpr {
    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 0.1F;
        double doubleNum = 12.5;
        double doubleNum2 = 10D;

        float floatResult = 0.0F;
        double doubleResult = 0.0;
        final double PI = 3.1415;
        final float LIGHt_SPEED = 3.0e5F;
        double div;
        double remaining;

        // Παραστάσειε με αριθμητικούς Τελεστές
        // +, -, *, /, %
        floatResult = floatNum + intNum;
        doubleResult = doubleNum + floatNum - intNum;
        div = 12.5 / 3;
        remaining = 12.5 % 3;

        System.out.printf("floatResult: %f\ndoubleResult: %f", floatResult ,doubleResult);
        System.out.println("div: " + div);
        System.out.println("mod: " + remaining);

        System.out.printf("div: %f\n" , div);
        System.out.printf("div: %.2f" , div);
    }
}
