package gr.aueb.cf.ch6;

public class ArraySymmetric {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 8, 1};
        int[] arr3 = {1, 2, 3, 4, 3, 2, 1};


        System.out.println(isArraySymmetric(arr1));
    }

    public static boolean isArraySymmetric(int[] arr){
        boolean isSymmetric = true;
        for ( int i =0, j = arr.length -1; i < j; i++, j--){
            if(arr[i] != arr[j]){
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    public static boolean isSymmetric(int[] arr){
        for(int i = 0; i<arr.length/2; i++){
            if(arr[i] != arr[arr.length-1-i]) {
                return false;
            }
        }
        return true;
    }

}
