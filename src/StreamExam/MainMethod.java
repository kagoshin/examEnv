package StreamExam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMethod {

    public static void main(String[] args) {

        Person person1 = new Person("bill", true, 25);
        Person person2 = new Person("rechard", false, 15);
        Person person3 = new Person("barack", true, 35);
        Person person4 = new Person("jimmy", false, 1);
        Person person5 = new Person("george", true, 2);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        System.out.println(existInfant(personList));

        System.out.println(existInfant2(personList));

        System.out.println(countBabyGirls(personList));

        System.out.println(countBabyGirls2(personList));

        List<String> psn = new ArrayList<>();
        psn = collectNmaesStartsWith(personList, "b");
        for (String name : psn) {
            System.out.println(name);
        }

    }

    public static boolean existInfant(List<Person> persons) {

        for (Person person : persons) {
            if (person.getAge() < 20) {
                return true;
            }
        }
        return false;
    }

    public static boolean existInfant2(List<Person> persons) {
        return persons.stream().anyMatch(p -> p.getAge() < 20);
    }

    public static int countBabyGirls(List<Person> persons) {

        int count = 0;
        for (Person person : persons) {
            if (!person.isMale() && person.getAge() <= 2) {
                count++;
            }
        }
        return count;
    }

    public static long countBabyGirls2(List<Person> persons) {

        return persons.stream().filter(p -> !p.isMale() && p.getAge() <= 2).count();

    }

    public static List<String> collectNmaesStartsWith(List<Person> persons, String prefix) {
        List<String> names = new ArrayList<>();

        for (Person person : persons) {
            String name = person.getName();
            if (name.startsWith(prefix)) {
                names.add(name);
            }
        }
        return names;
    }

    public static List<String> collectNmaesStartsWith2(List<Person> persons, String prefix) {

        return persons.stream().map(p -> p.getName())
                .filter(s -> s.startsWith(prefix))
                .collect(Collectors.toList());
    }
}
