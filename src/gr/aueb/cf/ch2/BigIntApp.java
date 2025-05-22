package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo
 */
public class BigIntApp {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1233445343434");
        BigInteger num2 = new BigInteger("9993224243434");
        BigInteger result;

        result = num1.add(num2);
        System.out.printf("Result %,d" , result);
    }
}
