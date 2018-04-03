package higorn.practice;

/**
 * Created by higor on 03/04/18.
 */
public class MakingAnagrams {
    public static int numberNeeded(String a, String b) {

        StringBuilder anagram = new StringBuilder();
        if (a.length() < b.length() || a.length() == b.length()) {
            StringBuilder bb = new StringBuilder(b);
            for (int i = 0; i < a.length(); i++) {
                String substring = a.substring(i, i + 1);
                int j = bb.indexOf(substring);
                if (j != -1) {
                    bb.deleteCharAt(j);
                    anagram.append(substring);
                }
            }
        } else {
            for (int i = 0; i < b.length(); i++) {
                String substring = b.substring(i, i + 1);
                if (a.contains(substring)) {
                    anagram.append(substring);
                }
            }
        }
        return (a.length() - anagram.length()) + (b.length() - anagram.length());
    }

    private static void buildAnagram(String a, String b, StringBuilder anagram, boolean backward) {
        if (b.contains(a)) {
            anagram.append(a);
        } else {
            if (backward) {
                buildAnagram(a.substring(0, a.length()-1), b, anagram, backward);
            } else {
                buildAnagram(a.substring(1), b, anagram, backward);
            }
        }
    }
}
