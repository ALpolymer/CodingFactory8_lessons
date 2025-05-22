package gr.aueb.cf.ch7;

public class StringReplace {
    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding.Factory.2025";
        String s3 = "Coding      Factory";

        String replaced1 = s1.replaceAll(" " , ":");
        System.out.println(replaced1);

        String replaced2 = s2.replaceAll("\\." , "");
        System.out.println(replaced2);

        String replaced3 = s3.replaceAll("\\s+" , " ");
        System.out.println(replaced3);
    }
}
