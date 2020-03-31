import java.util.Scanner;

public class FourthPart_8 {
    public static void main(String[] args) {
        int firstIndex = 4;
        int[] arr = {8, -9, -13, 8, 1, 9, -1, 9, 12, -1111, 12, 12, 12, 12};
        System.out.println(sumOfThree(firstIndex + 1, arr));
    }

    private static int sumOfThree(int key, int[] arr){
        int sum = arr[key] + arr[key + 1] + arr[key + 2];
        return sum;
    }
}
