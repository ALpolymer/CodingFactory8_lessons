package gr.aueb.cf.ch7;

public class SubStringApp {
    public static void main(String[] args) {
        String s = "Coding Factory";
        String subStr;
        String subStr2;

        subStr = s.substring(2);
        subStr2 = s.substring(2,4);

        System.out.println(subStr);
        System.out.println(subStr2);

    }
}
