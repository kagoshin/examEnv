package StreamExam;

public class Person {

    public Person(String name, boolean maleFlg, int age) {
        super();
        this.name = name;
        this.maleFlg = maleFlg;
        this.age = age;
    }

    private String name;
    private boolean maleFlg;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return this.maleFlg;
    }

    public void setMaleFlg(boolean nameFlg) {
        this.maleFlg = nameFlg;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
