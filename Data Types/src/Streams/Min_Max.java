package src.Streams;

import src.Declarative.gender;
import src.Declarative.person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Min_Max {
    public static void main(String[] args) {
        List<person> people = getPeople();
        people.stream().min(Comparator.comparing(person::getAge)).ifPresent(System.out::println);
        Optional<String> oldestFemale = people.stream().filter(person -> person.getGender().equals(gender.FEMALE)).max(Comparator.comparing(person::getAge)).map(person::getF_name);
        oldestFemale.ifPresent(System.out::println);
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
