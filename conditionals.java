class condition{
    public static void main(String[] args) {
        int x = 5;
        if (x>8) {
            System.out.println("5 is greator than 8");

        } else if(x == 5){
              System.out.println("5 is equal to five");
        }
        else {
            System.out.println("none is true");
        }
        //Ternary 
        if (x > 4) {
            System.out.println("5 is greator than 4");
        } else {
            System.out.println();
        }
        String result = (x>4) ? "5 is greator than 4" : "5 is less than 4";
        System.out.println(result);
    }
}