package gr.aueb.cf.ch6;

public class ArraySearch {
    public static void main(String[] args) {
        int position;
        int[] arr = {2,4,53,65,3,5};
        position = getPosition(arr , 8);

        if(position == -1) {
            System.out.println("NOT FOUND");
            return;
        }

        System.out.println("Position: " + (position +1 ) + " " + "Value: " + arr[position]);
    }

    public static int getPosition(int[] arr ,int value){
        int positionToReturn = -1;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == value){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
