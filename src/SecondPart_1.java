import java.util.Arrays;

public class SecondPart_1 {
    public static void main(String[] args) {
        int[][] multidimensionalArray = {{100, 2, 3}, {4, 5, 6}, {7, 8, 3}, {10, 11, 12}};
        int[][] transposedMultidimensionalArray = new int[multidimensionalArray[0].length][multidimensionalArray.length];
        int i = 0;
        for (int j = 0; j < multidimensionalArray.length; j++) { //транспонирование матрицы
            for (int k = 0; k < multidimensionalArray[j].length; k++) {
                transposedMultidimensionalArray[k][j] = multidimensionalArray[j][k]; //j - строки первоначальной матрицы и столбцы транспонированной. i - наоборот
            }
        }
        while (i < transposedMultidimensionalArray.length){ //вывод транспонированной матрицы с проверкой условия
            if (transposedMultidimensionalArray[i][0] > transposedMultidimensionalArray[i][transposedMultidimensionalArray[i].length-1]){
                System.out.println(Arrays.toString(transposedMultidimensionalArray[i]));
            }
            i += 2;
        }
    }
}
