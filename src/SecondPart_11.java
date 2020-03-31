import java.util.Random;

public class SecondPart_11 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][20];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (random.nextInt(16));
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int rowNumber = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5){
                    rowNumber++;
                }
            }
            if (rowNumber >= 3){
                System.out.println("Номер строки с количеством 5ок больше трёх: " + (i+1));
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
