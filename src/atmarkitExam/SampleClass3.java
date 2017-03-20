package atmarkitExam;

import java.math.BigDecimal;

public class SampleClass3 {

    public static void main(String[] args) {
        IsNumberInterface isNumIf = (String value) -> {
            try {
                new BigDecimal(value);
                return true;
            } catch (Exception e) {
                return false;
            }
        };

        System.out.println(isNumIf.check("8"));
        System.out.println(isNumIf.check("aaa"));

        // 実装1
        CalcInterface calcIf = (value1, value2) -> {
            return value1.add(value2);
        };
        System.out.println(calcIf.calc(new BigDecimal(1), new BigDecimal(2)));

        // 実装2
        CalcInterface calcIf2 = (value1, value2) -> value1.add(value2);
        System.out.println(calcIf2.calc(new BigDecimal(2), new BigDecimal(3)));

        // 実装3
        CalcInterface calcIf3 = (value1, value2) -> (value1 != null && value2 != null) ? value1.add(value2)
                : BigDecimal.ZERO;
        System.out.println(calcIf3.calc(new BigDecimal(3), new BigDecimal(5)));
        System.out.println(calcIf3.calc(null, new BigDecimal(3)));
    }

    @FunctionalInterface
    private interface IsNumberInterface {
        boolean check(String name);
    }

    @FunctionalInterface
    private interface CalcInterface {
        BigDecimal calc(BigDecimal value1, BigDecimal value2);
    }

}
