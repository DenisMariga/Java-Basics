package src;

public class Switch {
    public static void main(String[] args) {
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You are an admin");
                break;
            case "Accountant":
                System.out.println("You are an accountant");
                break;
            default :
                System.out.println("You are user");
        }
    }
}
