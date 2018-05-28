package higorn.practice.codility.counting;

import java.util.Arrays;

public class FrogRiverOne {
    public static int getEarliestJumpTime(int X, int[] A) {
        if (A.length < X) {
            return -1;
        }
        int max = 0;
        try {
            int[] positionsTimes = getLastPositionsTimes(A);
            for (int i = 1; i <= X; i++) {
                if (positionsTimes[i] == -1){
                    return -1;
                }
                if (positionsTimes[i] > max) {
                    max = positionsTimes[i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
        return max;
    }

    private static int[] getLastPositionsTimes(int[] a) {
        int[] positionsTimes = new int[a.length + 1];
        Arrays.fill(positionsTimes, -1);
        for (int i = 0; i < a.length; i++) {
            int time = positionsTimes[a[i]];
            if (i < time || time == -1) {
                positionsTimes[a[i]] = i;
            }
        }
        return positionsTimes;
    }
}
