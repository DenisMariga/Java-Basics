package src;

import java.util.Scanner;

public class whilel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";
        while (true){
            System.out.print("Enter: ");
            input=scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}
