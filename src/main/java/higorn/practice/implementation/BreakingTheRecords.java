package higorn.practice.implementation;

/**
 * Created by higor on 23/04/18.
 */
public class BreakingTheRecords {

    public static int[] breakingRecords(int[] score) {
        int resp[] = new int[2];

        resp[0] = getScoreCount(score, true);
        resp[1] = getScoreCount(score, false);

        return resp;
    }

    private static int getScoreCount(int[] score, boolean isHighest) {
        int aux = score[0];
        int count = 0;
        boolean found = false;

        for (int i = 1; i < score.length; i++) {
            if ((isHighest && score[i] > aux) || (!isHighest && score[i] < aux)) {
                found = true;
            }
            if (found) {
                aux = score[i];
                count++;
                found = false;
            }
        }

        return count;
    }
}
