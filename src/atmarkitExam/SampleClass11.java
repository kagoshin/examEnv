package atmarkitExam;

import java.math.BigDecimal;
import java.util.function.BiConsumer;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.LongSupplier;

public class SampleClass11 {

    public static void main(String[] args) {

        BiConsumer<String, BigDecimal> biConsumer = (string, bigdecimal) -> {
          System.out.println("string=" + string + ", bigdecimal=" + bigdecimal);
        };
        biConsumer.accept("aaa", new BigDecimal(100));

        DoublePredicate doublePredicate = value -> value > 3.14;
        boolean result = doublePredicate.test(2.05);
        System.out.println("doublePredicate.test(2.05) = " + result);

        LongSupplier longsupplier = () -> System.currentTimeMillis();
        long result2 = longsupplier.getAsLong();
        System.out.println("longsupplier.getAsLong() = " + result2);

        DoubleToIntFunction dToIFunc = value -> new BigDecimal(value).intValue();
        int result3 = dToIFunc.applyAsInt(3.14);
        System.out.println("dToIFunc.applyAsInt(3.14) = " + result3);
    }
}
