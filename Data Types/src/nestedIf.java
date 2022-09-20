package src;

public class nestedIf {
    public static void main(String[] args) {
        int i=40;
        if (i==40){
            System.out.println("i is equal to 40");
            if (i <= 30){
                System.out.println("i is greater than 30");
                if (i<50){
                    System.out.println("i is less than 50");
                }
            }
        }
        int a =1;
        int b=2;
        int result;
        result =a>b?b:a;
        if (a>b){
            result=b;
        }else {
            result=a;
        }
        System.out.println(result);

    }
}
