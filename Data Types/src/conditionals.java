package src;

public class conditionals {
    public static void main(String[] args) {
       byte temperature = 20;
        if (temperature > 30){
            System.out.println("its a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temperature >=20 && temperature <=30) {
            System.out.println("its a good day");
        }
        else
            System.out.println("Its a cold day");
}};