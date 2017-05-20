package taskNotesExam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class allMatchExam {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("hoge", "fuga", "bars");

        System.out.println(isCheckLength(strs.stream()));
    }

    private static boolean isCheckLength(Stream<String> s) {
        return s.allMatch(str -> str.length() == 4);
    }
}
