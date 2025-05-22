package gr.aueb.cf.ch7;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");
        String s4 = "Athens";

        boolean equals1 = s1 == s2;
        boolean equals2 = s1 == s3;
        boolean equals3 = s1.equals(s2);
        boolean equals4 = s1.equals(s3);
        boolean equals5 = s1.equalsIgnoreCase(s3);

        System.out.println(equals1);
        System.out.println(equals2);
        System.out.println(equals3);
        System.out.println(equals4);





    }
}
