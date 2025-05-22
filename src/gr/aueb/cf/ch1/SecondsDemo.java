package gr.aueb.cf.ch1;

import java.util.Scanner;

public class SecondsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int DAY = 24* 3600;
        final int HOUR = 3600;
        final int MINUTE = 60;
        int inputSeconds = 0;
        int days = 0, hours = 0, minutes = 0;
        int remainingSeconds = 0;

        System.out.println("Please insert time in seconds:");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds/DAY;
        remainingSeconds = remainingSeconds % DAY;

        hours = remainingSeconds/HOUR;
        remainingSeconds = remainingSeconds % HOUR;

        minutes = remainingSeconds/MINUTE;
        remainingSeconds = remainingSeconds%MINUTE;

        System.out.printf("Days: %d , Hours:%d ,Minutes: %d , seconds: %d",days , hours, minutes ,remainingSeconds);

    }
}
