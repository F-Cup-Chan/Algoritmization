public class SecondPart_5 {
    public static void main(String[] args) {
        int n = 8;
        int[][] squareMatrix = new int[n][n];
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length-i; j++) {
                squareMatrix[i][j] = i + 1;
            }
        }
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
