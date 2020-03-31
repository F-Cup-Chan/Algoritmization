public class SecondPart_10 {
    public static void main(String[] args) {
        int[][] squareMatrix = {{-1, 2, 3, 4, 15}, {-5, 6, 7, -8, 0}, {9, -10, 110, 12, -50}, {13, 14, 15, -16, -111}, {15, 67, 76, 56, 2}};
        for (int i = 0; i < squareMatrix.length; i++) {
            if (squareMatrix[i][i] >= 0) System.out.println("Положительный элемент диагонали матрицы имеет координаты " + (i + 1) + " " + (i + 1));
        }
    }
}
