package src;

public class Casting {
public static void main(String[] args) {
    //    widening casting
    int number1 = 120;
    double number2 = number1;
    System.out.println(number1);
    System.out.println(number2);
    double number3 =123.23d;
    float float_d = (float) number3;
    System.out.println("Double - Float: "+ float_d);
    int number4= (int)number3;
    System.out.println("number 4: "+ number4);
    String number5= "2";
    int y = Integer.parseInt((number5)+2);
    System.out.println("parse "+y);
    System.out.println(number3);
    System.out.println(number4);

}
}
