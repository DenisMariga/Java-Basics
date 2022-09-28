package src.Streams;

import java.util.ArrayList;

public class StreamLoop {
    public static void main(String[] args) {
        ArrayList<String> arrayList2=new ArrayList<>(5);
        arrayList2.add("Python");
        arrayList2.add("Java");
        arrayList2.add("Flutter");
        arrayList2.add("Basic");
        arrayList2.add("Kotlin");
//        arrayList2.stream().forEach(i->{
//            System.out.println(i);
//        });
        arrayList2.forEach(System.out::println);

    }
}
