public class SecondPart_7 {
    public static void main(String[] args) {
        int n = 9;
        int amountOfPositive = 0;
        double[][] squareMatrix = new double[n][n];
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] = Math.sin((i*i - j*j)/squareMatrix.length);
                if (squareMatrix[i][j] >= 0) amountOfPositive++;
            }
        }
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length; j++) {
                System.out.print(squareMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(amountOfPositive);
    }
}
