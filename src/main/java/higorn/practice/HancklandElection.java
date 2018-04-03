package higorn.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

/**
 * Created by higor on 03/04/18.
 */
public class HancklandElection {

    public static String electionWinner(String[] votes) {
        Map<String, Integer> counting = new HashMap<>();
        Stream.of(votes).forEach(vote -> {
            if (counting.keySet().contains(vote)) {
                Integer n = counting.get(vote);
                counting.put(vote, n+1);
            } else {
                counting.put(vote, 1);
            }

        });
        return counting.entrySet().stream()
//                .sorted(Map.Entry.comparingByKey().reversed())
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
//                .sorted((e1, e2) -> Comparator.reverseOrder().compare(e1.getKey(), e2.getKey())
                .max(Map.Entry.comparingByValue()).get().getKey();
    }
}
