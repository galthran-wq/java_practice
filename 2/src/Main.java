import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<Human> sortByFirstName(List<Human> people) {
        List<Human> copy = new ArrayList<>(people);
        Comparator<Human> compareByFirstName = (o1, o2) -> o1.getFirstname().compareTo(o2.getFirstname());
        copy.sort(compareByFirstName);
        return copy;
    }

    public static List<Human> sortBySurname(List<Human> people) {
        List<Human> copy = new ArrayList<>(people);
        Comparator<Human> compareBySurname = (o1, o2) -> o1.getLastName().compareTo(o2.getLastName());
        copy.sort(compareBySurname);
        return copy;
    }

    public static List<Human> filterByBirthdate(List<Human> people) {
        return people.stream()
                .filter(p -> p.getBirthDate().isAfter(
                        LocalDate.of(2002, 6, 26)
                ))
                .collect(Collectors.toList());
    }

    public static Integer getAgesSum(List<Human> people) {
        int sum = 0;
        for (Human human : people) {
            sum += human.getAge();
        }
        return sum;
    }



    public static void main(String[] args) {
        List<Human> people = List.of(new Human(33,"Ban","Ben", LocalDate.of(1970,12,18),70),
                new Human(46,"Kivin","Kevin", LocalDate.of(2001,6,20),50),
                new Human(30,"Ashley","Ahley", LocalDate.of(1998,11,30),95),
                new Human(65,"Trot","Yolo", LocalDate.of(1960,1,30),77),
                new Human(71,"Reigan","Uorl", LocalDate.of(2002,7,29),66),
                new Human(46,"Danny","Kevin", LocalDate.of(2005,4,20),50),
                new Human(30,"Poro","Ahley", LocalDate.of(2017,11,30),95),
                new Human(65,"Krei","Yolo", LocalDate.of(1950,1,30),77),
                new Human(71,"Dae","Uorl", LocalDate.of(1998,7,29),66)
        );

        System.out.println(sortByFirstName(people));
        System.out.println(sortBySurname(people));
        System.out.println(getAgesSum(people));
        System.out.println(filterByBirthdate(people));
    }
}
