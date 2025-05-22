package gr.aueb.cf.ch6;

public class ArraysAndMethods1 {
    public static void main(String[] args) {
        int[] arr = {2,5,7,4,7,8,3,6,7};
        printArray(arr ,1,2);
    }

    public static void printArray(int[] arr , int low, int high){
        if(low<0 || high > arr.length){
            return;
        }

        if(low > high){
            return;
        }

        for (int i = low; i < high ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
