package src.Streams;

import src.Declarative.gender;
import src.Declarative.person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class group {
    public static void main(String[] args) {
        List<person> people = getPeople();
        Map<gender, List<person>> groupByGender =
                people.stream().collect(Collectors.groupingBy(person::getGender));
        groupByGender.forEach((gender,people1)->{
            System.out.println(gender);
            people1.forEach(System.out::println);
        });

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
