import java.util.Arrays;

public class SecondPart_3 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int k = 1; //строки
        int p = 3; //столбцы
        System.out.println(Arrays.toString(matrix[k-1])); //выводит строку
        for (int i = 0; i < matrix.length; i++) { //выводит столбец
            System.out.print(matrix[i][p-1] + " ");
        }
    }
}
