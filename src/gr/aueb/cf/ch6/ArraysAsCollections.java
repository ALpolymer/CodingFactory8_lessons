package gr.aueb.cf.ch6;

public class ArraysAsCollections {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        int[] result1 = filterEven(arr);

        for (int j : result1) {
            System.out.print(j);
        }

    }

    public static int[] filterEven(int[] arr){
        if(arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for (int el : arr){
            if(el % 2 == 0){
                arrayToReturn[count] = el;
                count++;
            }
        }
        return arrayToReturn;
    }

  public static boolean allEven(int[] arr){
        for(int el : arr){
            if(el%2==1) return false;
        }
        return true;
  }


  public static boolean moreThanTwoConsecutive(int[] arr){
      for (int i = 0; i < arr.length -2 ; i++) {
          if (arr[i] == arr[i+1] -1  && arr[i] == arr[i+2] -2){
              return true;
          }
      }
      return false ;
  }

    public static boolean moreThanTwoWithSameEnding(int[] arr){
        int[] endings = new int[10];
        for(int el : arr){
            int ending = el % 10;
            int count = endings[ending]++;
            if(count > 2) return true;
        }
        return false;
    }

}


