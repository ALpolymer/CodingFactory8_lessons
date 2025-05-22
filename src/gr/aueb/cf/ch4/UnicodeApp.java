package gr.aueb.cf.ch4;

/**
 * Demo for surrogate pairs
 */

public class UnicodeApp {
    public static void main(String[] args) {
        int codepoint = 0x1FAE0;//surrogate pair emoji
        System.out.println(Character.toChars(codepoint));
        System.out.println("\u20ac"); //euro sign
        System.out.println("\u00A9"); //copyright sign
        System.out.println("\u2103"); //Celsius sign
    }
}
