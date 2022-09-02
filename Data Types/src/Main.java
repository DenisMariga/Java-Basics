package src;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Date date = new Date();
        System.out.println(date);
        String message="Good Bye World";
        System.out.println(message.startsWith("G"));
        System.out.println(message.endsWith("l"));
        System.out.println(message.replace("Bye","Day"));
    }
}