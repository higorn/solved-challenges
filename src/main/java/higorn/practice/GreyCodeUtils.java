package higorn.practice;

public class GreyCodeUtils {
    public static int toGray(int n) {
        return n ^ (n >> 1);
    }

    public static int toBinary(int n) {
        int mask = n >> 1;
        while (mask != 0) {
            n = n ^ mask;
            mask = mask >> 1;
        }
        return n;
    }

    public static int toBinary32(int n) {
        n = n ^ (n >> 16);
        n = n ^ (n >> 8);
        n = n ^ (n >> 4);
        n = n ^ (n >> 2);
        n = n ^ (n >> 1);
        return n;
    }
}
