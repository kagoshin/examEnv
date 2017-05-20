package taskNotesExam;

import java.util.Arrays;
import java.util.List;

/**
 * @author Shinnosuke Kagoshima
 *http://www.task-notes.com/entry/20150418/1429359646
 */
public class filterExam {

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(100, 200, 300, 400, 500);

        prices.stream().filter(pri -> pri > 200).forEach(System.out::println);
    }

}
