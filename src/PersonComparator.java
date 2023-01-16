import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        int length1 = o1.getSurname().split("(?U)\\W").length;
        int length2 = o2.getSurname().split("(?U)\\W").length;
        if (length1 > length2) {
            return 1;
        } else if (length1 == length2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        return -1;
    }
}
