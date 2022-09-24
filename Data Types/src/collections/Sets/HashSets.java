package src.collections.Sets;

import java.util.HashSet;
//cannot contain duplicates values
public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        System.out.println(hashSet);
        System.out.println("The hash set contains 4: "+ hashSet.contains(4));
        System.out.println("Size of the Set: "+hashSet.size());
        for (Integer i : hashSet){
            System.out.print(i+"_");
        }
    }
}
