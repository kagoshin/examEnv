package atmarkitExam;

public class SampleClass8 {

    public static void main(String[] args) {
        SampleClass8 sc4 = new SampleClass8();
        sc4.process();
    }

    private void process() {
        // 匿名クラス
        DoSomethingIF anonymous = new DoSomethingIF() {

            @Override
            public void doSomething() {
                System.out.println("匿名クラス：" + this.getClass());
            }
        };
        anonymous.doSomething();

        // ラムダ式
        DoSomethingIF lambda = () -> {
            System.out.println("ラムダ式：" + this.getClass());
        };
        lambda.doSomething();
    }

}
