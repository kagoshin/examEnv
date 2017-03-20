package atmarkitExam;

public class SampleClass2 {

    public static void main(String[] args) {

        SampleInterface2 sampleIf = new SampleInterface2() {

            @Override
            public void say(String name) {
                System.out.print("Hello, " + name);
            }
        };
        sampleIf.say("taro");
    }

    private interface SampleInterface2 {
        public void say(String name);
    }

}
