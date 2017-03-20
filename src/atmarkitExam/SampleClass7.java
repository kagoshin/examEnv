package atmarkitExam;

public class SampleClass7 {

    private void process() {
        DoSomethingIF funcIf = () -> {
            privateMethod();
            method();
            protectedMethod();
            publicMethod();
            privateStaticMethod();
        };
        funcIf.doSomething();
    }

    private void privateMethod() {
        System.out.println("private method");
    }

    void method() {
        System.out.println("method");
    }

    protected void protectedMethod() {
        System.out.println("protected method");
    }

    public void publicMethod() {
        System.out.println("public method");
    }

    private static void privateStaticMethod() {
        System.out.println("private static method");
    }

    public static void main(String[] args) {
        SampleClass7 sc3 = new SampleClass7();
        sc3.process();

    }

}
