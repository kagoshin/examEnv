package atmarkitExam;

public class SampleClass9 {

    public static void main(String[] args) {
        // ラムダ式
        GetInterfaceIF<DoSomethingIF> getInterface = () -> () -> System.out.println("Hello");
        // DoSomethingIFインスタンスを返却
        DoSomethingIF doSomethingIf = getInterface.get();
        doSomethingIf.doSomething();

        // 匿名クラス
        GetInterfaceIF<DoSomethingIF> getInterface2 = () -> {
            return new DoSomethingIF() {

                @Override
                public void doSomething() {
                    System.out.println("Hello anonymous");

                }
            };
        };
        DoSomethingIF doSomethingIf2 = getInterface2.get();
        doSomethingIf2.doSomething();
    }
}
