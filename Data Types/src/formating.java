package src;

import java.text.NumberFormat;

public class formating {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1111111.211);
        String percent= NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
        System.out.println(percent);
        double a = 30;
        double b=2;
        System.out.println(Math.pow(4,2));
    }
}
