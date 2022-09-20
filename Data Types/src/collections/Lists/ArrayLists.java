package src.collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> myArray= new ArrayList<>(5);
        for (int i=1; i <=5; i++){
            myArray.add(i);
        }
        System.out.println(myArray);
        for(int m: myArray){
            System.out.print(m+" ");
        }
        myArray.add(0,0);
        System.out.print(myArray);
        for (Integer integer : myArray) {
            System.out.print(integer + " ");
        }
    }

}
