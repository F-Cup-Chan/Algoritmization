import java.util.Arrays;

public class ThirdPart_7 {
    public static void main(String[] args) {
        int[] firstSequence = {1, 2, 4, 6, 8, 9, 11, 12, 18, 102, 123, 150};
        int[] secondSequence = {8, 9, 13, 18, 81, 95, 101, 120, 1111};
        int[] arr = new int[firstSequence.length + 1];
        System.arraycopy(firstSequence, 0, arr, 0, firstSequence.length);
        int[] bufferArr = new int[arr.length];
        System.arraycopy(arr, 0, bufferArr, 0, arr.length);
        for (int i = 0; i < secondSequence.length; i++) {
            System.arraycopy(bufferArr, 0, arr, 0, arr.length);
            arr[arr.length-1] = secondSequence[i];
            Arrays.sort(arr);
            System.out.println("Число " + secondSequence[i] + " нужно вставить на место " + Arrays.binarySearch(arr, secondSequence[i]));
        }
    }
}
