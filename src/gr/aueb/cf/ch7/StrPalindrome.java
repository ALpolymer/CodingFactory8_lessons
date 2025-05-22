package gr.aueb.cf.ch7;

public class StrPalindrome {
    public static void main(String[] args) {
        String str = "abban";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s){
        String sb  = new StringBuilder(s).reverse().toString();
        return sb.equals(s);
    }
}
