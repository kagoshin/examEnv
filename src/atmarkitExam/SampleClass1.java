package atmarkitExam;

public class SampleClass1 {

    public static void main(String[] args) {
        SampleInterface sampleInterface = (String name) -> System.out.println("Hello, " + name);
        sampleInterface.say("taro");
    }

    @FunctionalInterface
    private interface SampleInterface {
        public void say(String name);
    }
}
