import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String... args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("Nikolay", "Nikolaev", 16));
        person.add(new Person("Ivan", "Ivanov", 30));
        person.add(new Person("Igor", "Kulebyakin", 35));
        person.add(new Person("Lena", "Glassovna", 24));


        Comparator<Person> comparator;

        comparator = (Person o1, Person o2) -> {
            return Person.compare(o1, o2);
        };

        Predicate<Person> predicate = p-> p.getAge() <18;
       person.removeIf(predicate);

        Collections.sort(person, comparator);

        System.out.println(person);
    }
}
