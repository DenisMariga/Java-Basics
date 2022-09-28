package src.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> programming = new ArrayList<>(4);
        programming.add("Java");
        programming.add("Python");
        programming.add("JavaScript");
        programming.add("Php");
        List<String> filter = new ArrayList<>(4);
        for (String p : programming) {
            if (p.startsWith("P")) {
                filter.add(p);
            }
        }
        System.out.println("Programming languages starting with P: " + filter);
        //USING STREAMS
        List<String> j = programming.stream().filter(pr -> pr.startsWith("J")).collect(Collectors.toList());
        System.out.println("Programming languages starting with J: " + j);

    }
}
