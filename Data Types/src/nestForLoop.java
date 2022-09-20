package src;

public class nestForLoop {
    public static void main(String[] args) {
        int[][] arr ={{2,2,3},{2,5,3},{3,7,9}};
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}
