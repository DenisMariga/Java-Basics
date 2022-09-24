package src.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer>hashMap=new HashMap<>();
        hashMap.put("b",2);
        hashMap.put("a",3);
        hashMap.put("d",4);
        hashMap.put("c",5);
        System.out.println("Printing whole hashmap: "+hashMap);
        System.out.println("Does the hashmap contain 4 as value: "+hashMap.containsValue(4));
        System.out.println("Key Set: "+hashMap.keySet());
        System.out.println("Entry Set: "+hashMap.entrySet());


        System.out.println("Value for a: "+hashMap.get("a"));
        if (hashMap.containsKey("b")){
            Integer a=hashMap.get("b");
            System.out.println("value for key "+" \"b\" is: "+ a);
        }
        for (Entry<String,Integer>entry:hashMap.entrySet()){
            System.out.println("Key: "+ entry.getKey()+ ",Value: "+ entry.getValue());
        }
        Map<Integer,String> t=new HashMap<>();
        t.put(1,"d");
        t.put(4,"f");
        t.put(3,"d");
        t.put(2,"z");
        System.out.println(t.entrySet());
    }

}
