public class SecondPart_15 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 20, 4}, {-5, 60, -7, 3}, {-9, 0, 111, -12}, {103, 4, -5, 1,}, {10, -8, 109, -110}};
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) { //поиск максимального элемента
            int maxElementInRow = matrix[0][0];
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElementInRow){
                    maxElementInRow = matrix[i][j];
                }
            }
            if (maxElementInRow > maxElement){
                maxElement = maxElementInRow;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (Math.abs(matrix[i][j]) % 2 == 1){
                    matrix[i][j] = maxElement;
                }
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
