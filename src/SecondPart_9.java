import java.util.Arrays;

public class SecondPart_9 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16,}, {17, 18, 19, 20}, {21, 22, 23, 24}};
        int[] sumArray = new int[matrix[0].length];
        int maxCol = 0;
        int numMaxCol = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumArray[j] += matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(sumArray));
        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] > maxCol){
                maxCol = sumArray[i];
                numMaxCol = i+1;
            }
        }
        System.out.println(numMaxCol);
    }
}
