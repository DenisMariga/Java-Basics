package src.Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>(4);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        Integer reduce = numbers.stream().reduce(0, Integer::sum);//.reduce(0, (sum, i) -> sum + i);
        System.out.println(reduce);
    }
}
