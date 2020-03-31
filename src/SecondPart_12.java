import java.util.Arrays;

public class SecondPart_12 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 20, 4}, {-5, 60, -7, 3}, {-9, 0, 111, -12}, {103, 4, -5, 1,}, {10, -8, 109, -110}};
        for (int i = 0; i < matrix.length; i++) { //гениальный метод, который сделал за меня всю работу
            Arrays.sort(matrix[i]);
        }
        System.out.println("По возрастанию: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("По убыванию: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][matrix[i].length - j - 1] + " ");
            }
            System.out.println();
        }
    }
}
