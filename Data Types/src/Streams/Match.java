package src.Streams;

import src.Declarative.gender;
import src.Declarative.person;

import java.util.List;

public class Match {
    public static void main(String[] args) {
        List<person> people = getPeople();
        boolean anyMatch = people.stream().anyMatch(person -> person.getAge() > 11);
        boolean allMatch = people.stream().allMatch(person -> person.getAge() > 11);
        boolean NoneMatch = people.stream().noneMatch(person -> person.getF_name().equals("Kamara") );

        System.out.println("Any Match: "+anyMatch);
        System.out.println("All Match: "+allMatch);
        System.out.println("None Match: "+NoneMatch);

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
