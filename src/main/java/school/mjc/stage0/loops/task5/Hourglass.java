package school.mjc.stage0.loops.task5;

import java.util.Collections;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 0) {
            return;
        }
        boolean moving = true;
        int left = 1;
        int right = height;
        for (int i = 0; i < height / 2; i++) {
            for (int j = 1; j <= height; j++) {
                if (j < left || j > right)
                    System.out.print(" ");
                else System.out.print(8);
            }
            right--;
            left++;
            System.out.println();
        }
        int n=height;
        if ((int) (height / 2) * 2 == height) {
            right++;
            left--;
            n--;
        }
        for (int i = 0; i <= n / 2; i++) {
            for (int j = 1; j <= height; j++) {
                if (j < left || j > right)
                    System.out.print(" ");
                else System.out.print(8);
            }
            right++;
            left--;
            System.out.println();
        }

    }
}
