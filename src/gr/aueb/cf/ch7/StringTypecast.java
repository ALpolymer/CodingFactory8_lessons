package gr.aueb.cf.ch7;

import java.math.BigInteger;

public class StringTypecast {
    public static void main(String[] args) {
        double myDouble = 8.5;
        System.out.println(myDouble + "\ntype:Double");
        String strDouble = String.valueOf(myDouble); //from primitive to string
        System.out.println(strDouble);
        System.out.println(strDouble.getClass().getSimpleName());


        BigInteger bigInt = new BigInteger("12234343432");
        System.out.println(bigInt);
        System.out.println(bigInt.getClass().getSimpleName());
        String strBigInt = bigInt.toString();//from class to string
        System.out.println(strBigInt);
        System.out.println(strBigInt.getClass().getSimpleName());


    }
}
