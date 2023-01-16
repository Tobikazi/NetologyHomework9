import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("Ivan", "Ivanov", 30));
        person.add(new Person("Igor", "Kulebyakin", 35));
        person.add(new Person("Lena", "Glassovna", 24));

        Collections.sort(person, new PersonComparator());

        System.out.println(person);
    }
}