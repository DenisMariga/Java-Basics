package src.collections.Lists;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String>linkedList=new LinkedList<>();
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        linkedList.addFirst("1");
        linkedList.addLast("6");
        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("3"));
    }
}
