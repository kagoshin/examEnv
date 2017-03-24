package atmarkitExam;

import java.util.Arrays;
import java.util.stream.Stream;

public class SampleClass12 {

    public static void main(String[] args) {
        String[] values = { "あお", "きいろ", "みどり", "おれんじ", "あか" };
        Stream<String> stream = Arrays.stream(values);
        String result = stream.filter(p -> p.contains("あ")).max((v1, v2) -> v1.compareTo(v2)).get();
        System.out.println("result = " + result);
    }
}
