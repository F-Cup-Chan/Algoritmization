import java.util.Arrays;

public class SecondPart_13 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 20, 4}, {-5, 60, -7, 3}, {-9, 0, 111, -12}, {103, 4, -5, 1,}, {10, -8, 109, -110}};
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) { //транспонирование матрицы
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++) { //опять гениальный метод, который сделал за меня всю работу
            Arrays.sort(transposedMatrix[i]);
        }
        for (int i = 0; i < transposedMatrix.length; i++) { //обратное транспонирование матрицы
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                matrix[j][i] = transposedMatrix[i][j];
            }
        }
        System.out.println("По возрастанию: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("По убыванию: ");
        for (int i = matrix.length-1; i > -1; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
