import java.util.Arrays;

public class ThirdPart_1 {
    public static void main(String[] args) {
        int[] arrayOne = {10, 15, 20, 25};
        int[] arrayTwo = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int bufferLength = arrayOne.length;
        int k = 2;
        arrayOne = Arrays.copyOf(arrayOne, arrayOne.length + arrayTwo.length); // увеличиваю первый массив на длинну второго
        System.arraycopy(arrayOne, 0, arrayOne, arrayOne.length - bufferLength, bufferLength); // копирую первый массив в конец нового массива
        System.arraycopy(arrayTwo, 0, arrayOne, k, arrayTwo.length); // вставляю второй массив в второй массив в первый. все лишние элементы первого массива будут перезаписаны элементами второго массива
        System.out.println(Arrays.toString(arrayOne));
    }
}
