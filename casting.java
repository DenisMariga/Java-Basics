//Type casting is when you assign a value of one primitive data type to another type
//Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double
// Narrowing Casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte
class casting{
    public static void main(String[] args) {
        byte num  = 127;
        int num2 = num;
        System.out.println(num);
        System.out.println(num2);
        double num3 = 123.444;
        int num4 = (int) num3;
        System.out.println("Double is"+ num3);
        System.out.println(num4);

    }
}