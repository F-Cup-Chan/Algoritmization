public class SecondPart_2 {
    public static void main(String[] args) {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Главная диагональ:");
        for (int i = 0; i < squareMatrix.length; i++) { //главная диагональ
            System.out.println(squareMatrix[i][i]);
        }
        System.out.println("Побочная диагональ:");
        for (int i = 0; i < squareMatrix.length; i++) { //побочная диагональ матрицы
            System.out.println(squareMatrix[i][squareMatrix.length-1-i]);
        }
    }
}
