package src;
import java.util.Arrays;
public class ArraysL {
    public static void main(String[] args) {
        int[] numbers = {2,5,4,1,3};
        java.util.Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //multi-dimensional arrays
        int[][] numbers2  = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(numbers2));
    }
}
