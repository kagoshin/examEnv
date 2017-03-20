package atmarkitExam;

public class SampleClass10 {

    private IntToStringInterface intToStringIf;

    public void process(int arg) {
        intToStringIf = value -> value < 10
                ? intToStringIf.convert(++value)
                : String.valueOf(value);
        System.out.println("結果=" + intToStringIf.convert(arg));
    }

    public static void main(String[] args) {
        SampleClass10 sc6 = new SampleClass10();
        sc6.process(0);
        sc6.process(11);
    }
}
