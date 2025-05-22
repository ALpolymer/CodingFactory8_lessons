package gr.aueb.cf.ch6;
import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] reversed;
     int[] arr = {2,3,4,5,6,7,8};
     reversed = reverseMeth(arr);
        for (int i = 0; i < reversed.length ; i++) {
            System.out.print("[" + reversed[i] + "]");
        }

    }

    public static int[] reverseMeth(int[] arr){
        int[] reversed = new int[arr.length];
        for (int i = arr.length -1; i >= 0 ; i--) {
            reversed[arr.length-1 - i] = arr[i];
        }
        return reversed;
    }
}
