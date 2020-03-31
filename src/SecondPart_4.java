public class SecondPart_4 {
    public static void main(String[] args) {
        int n = 10;
        int[][] squareMatrix = new int[n][n];
        for (int i = 0; i < squareMatrix.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = j+1;
                }
            } else {
                for (int j = 0; j < squareMatrix[i].length; j++) {
                    squareMatrix[i][j] = n - j;
                }
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
