package src;

import static java.util.Arrays.sort;

public class enhancedForLoops {
    public static void main(String[] args) {
        int []i={1,3,2,7,5,6,4};
        for (int count :i){
            sort(i);
            System.out.println("Count: "+count);
        }
    }
}
