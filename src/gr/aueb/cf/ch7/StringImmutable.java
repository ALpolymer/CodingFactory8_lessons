package gr.aueb.cf.ch7;

import java.util.Arrays;

public class StringImmutable {
    public static void main(String[] args) {
        String s1 ="Coding";
        String s2 = "Coding";

        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;

        arr2[0] = 10;
        s2 = "Factory";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}
