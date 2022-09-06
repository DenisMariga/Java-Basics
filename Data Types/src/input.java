package src;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name= scanner.nextLine().trim();
        System.out.println("My name is "+ name);
    }
}
