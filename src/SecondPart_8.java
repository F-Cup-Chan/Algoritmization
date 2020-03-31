import java.util.Scanner;

public class SecondPart_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers of columns");
        int firstCol = scanner.nextInt();
        int secondCol = scanner.nextInt();
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16,}, {17, 18, 19, 20}};
        int buffer;
        for (int i = 0; i < matrix.length; i++) {
            buffer = matrix[i][firstCol-1];
            matrix[i][firstCol-1] = matrix[i][secondCol-1];
            matrix[i][secondCol-1] = buffer;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
