import java.util.Random;

public class SecondPart_14 { // для корректной работы программы количетсво столбцов должно быть меньше количества строк. иначе невозможно будет вывести все единицы
    public static void main(String[] args) {
        int rows = 14;
        int cols = 12;
        int[][] matrix = new int[cols][rows];
        int[][] transposedMatrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (i + 1); j++) {
                int column = random.nextInt(matrix[i].length);
                if (matrix[i][column] == 0){
                    matrix[i][column] = 1;
                } else if (rows < cols && j >= rows){ //чтобы не получить бесконечный цикл. невозможно вписать 1 на мето 0, если 0 уже нет.
                    continue;
                } else {
                    j--;
                }
            }
        }
        System.out.println("sdf");
        for (int i = 0; i < matrix.length; i++) { //транспонирование матрицы
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
