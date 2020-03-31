import java.util.Arrays;

public class ThirdPart_3 {
    public static void main(String[] args) {
        int[] sequence = {1, 1, 2, 3, 4, 4, 6, 10, 10, 78, 100, 100, 101, 102, 103, 103, 103};
        for (int i = 0; i < sequence.length/2; i++) {
            int buffer = sequence[i];
            sequence[i] = sequence[sequence.length-i-1];
            sequence[sequence.length-i-1] = buffer;
        }
        System.out.println(Arrays.toString(sequence));
    }
}
