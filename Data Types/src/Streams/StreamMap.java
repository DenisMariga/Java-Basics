package src.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(3);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(4);
//        ArrayList<Integer>SquareArrayList=new ArrayList<>(3);
//arrayList.forEach(System.out::println);
//        for (Integer I: arrayList){
//            SquareArrayList.add(I*I);
//        }
//        System.out.println(SquareArrayList);
        //FUNCTIONAL PROGRAMMING
        List<Integer> collect = arrayList.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(collect);
    }
}
