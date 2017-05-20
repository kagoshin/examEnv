package taskNotesExam;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shinnosuke Kagoshima
 *http://www.task-notes.com/entry/20150418/1429359646
 */
public class SortedExam {

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(300, 100, 500, 200, 400);

        prices.stream().sorted().forEach(System.out::println);
    }

}
