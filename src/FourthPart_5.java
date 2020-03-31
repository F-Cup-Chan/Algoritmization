import java.util.Arrays;

public class FourthPart_5 {
    public static void main(String[] args) {
        int[] arr = {8, -9, -13, 8, 1, 9, -1, 9, 12, -1111, 12, 12, 12, 12};
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != arr[i - 1]){
                System.out.println(arr[i - 1]);
                break;
            }
        }
    }
}
