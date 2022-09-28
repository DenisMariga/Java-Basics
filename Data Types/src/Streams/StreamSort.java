package src.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>(5);
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("Flutter");
        arrayList.add("Basic");
        arrayList.add("Kotlin");
        List<String> collect = arrayList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }

}

