package atmarkitExam;

public class SampleClass5 {

    private int classField = 0;
    private static int staticField = 0;

    public void process() {

        int i = 0;
        SampleClass6 sc2 = new SampleClass6();
        DoSomethingIF functionalIf = () -> {
            classField++;
            staticField++;
            // i++; // メソッド内のfinalでないローカル変数やメソッドの引数を変えようとするとエラーになる
            System.out.println("i =" + i); // ローカル変数の値を変えずに参照するのみの場合エラーにならない
            sc2.field++;
        };

        System.out.println("Before; classField = " + classField);
        System.out.println("Before; staticField = " + staticField);

        functionalIf.doSomething();
        System.out.println("After; classField = " + classField);
        System.out.println("After; staticField = " + staticField);
        System.out.println("After; sc2.field = " + sc2.field);

    }

}
