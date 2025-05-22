package gr.aueb.cf.ch6;

public class ArraysAndMethods {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num =5;
        printArray(arr);
        System.out.println();
        for(int el : arr){
            System.out.print(el + " ");
        }
        System.out.println();
        printNum(num);
        System.out.println(num);


    }

    public static void printArray(int[] arr){
        arr[0] = 1000;
        for(int el : arr){
            System.out.print(el + " ");
        }
    }

    public static void printNum(int num){
        num =100;
        System.out.println(num);
    }
}
