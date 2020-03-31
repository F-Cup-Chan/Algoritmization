public class SecondPart_6 {
    public static void main(String[] args) {
        int n = 20;
        int[][] squareMatrix = new int[n][n];
        for (int i = 0; i < (squareMatrix.length/2); i++) {
            for (int j = i; j < squareMatrix[i].length-i; j++) {
                squareMatrix[i][j] = 1;
            }
        }
        for (int i = squareMatrix.length/2; i < squareMatrix.length; i++) {
            for (int j = i; j > squareMatrix[i].length-i-2; j--) {
                squareMatrix[i][j] = 1;
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
