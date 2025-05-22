package gr.aueb.cf.ch7;

import java.util.Arrays;

public class StringSplit {
    public static void main(String[] args) {
        String s = "Uni of Econ And Business";
        String result = "";

        String [] tokens = s.split("");

        System.out.println(Arrays.toString(tokens));

        for( String ch : tokens){
            result = result.concat(ch);
        }

        System.out.println(result);
    }
}
