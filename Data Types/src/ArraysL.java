package src;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class ArraysL {
    public static void main(String[] args) {
        int[] numbers = {2,5,4,1,3};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //two-dimensional arrays
        int[][] numbers2  = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(numbers2));
        for (int i=0;i<numbers.length;i++){
            System.out.println("i"+numbers[i]);  
        }
        int[] anArray;
        anArray=new int[10];
        anArray[0]=100;
        anArray[1]=200;
        System.out.println(Arrays.deepToString(new int[][]{anArray}));
        //Multi-dimensional arrays
        int [][][] arr={{{1,2,3},{4,5,6}},{{7,8,9},{1,6,7}}};
        System.out.println(arr[0][0][0]);

    }
}
