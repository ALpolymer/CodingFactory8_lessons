package gr.aueb.cf.ch4;

public class Stars {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=6 ; j++) {
                if (j<= n-i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
