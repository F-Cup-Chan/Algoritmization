import java.util.Arrays;

public class ThirdPart_6 {
    public static void main(String[] args) {
        int[] sequence = {1, 0, 20, 4, -5, 60, -7, 3, -9, 0, -12, 103, 4, -5, 1, 10, -8, 109, -110, 11};

        int n = sequence.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = sequence[i];
                int j = i;
                while (j >= gap && sequence[j - gap] > key) {
                    sequence[j] = sequence[j - gap];
                    j -= gap;
                }
                sequence[j] = key;
            }
        }
        System.out.println(Arrays.toString(sequence));
    }
}
