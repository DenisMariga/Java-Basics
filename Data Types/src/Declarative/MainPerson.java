package src.Declarative;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainPerson {
    public static void main(String[] args) {
        List<person> people = getPeople();
        List<person> Female = people.stream().filter(female -> female.getGender().equals(gender.FEMALE)).collect(Collectors.toList());
        System.out.println("Filtering all females: ");
        Female.forEach(System.out::println);
        List<person> sortingAge = people.stream().sorted(Comparator.comparing(person::getAge).thenComparing(person::getGender).reversed()).collect(Collectors.toList());
        System.out.println("Sorting by age: ");
        sortingAge.forEach(System.out::println);
    }

    private static List<person> getPeople() {
        return List.of(
                new person(22, "Denis", "Mariga", gender.MALE),
                new person(10, "Vanessa", "Wanjiku", gender.FEMALE),
                new person(12, "Daftin", "Murimi", gender.MALE),
                new person(20, "Tatiana", "Wamaitha", gender.FEMALE)
        );
    }

}
