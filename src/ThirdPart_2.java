import java.util.Arrays;

public class ThirdPart_2 {
    public static void main(String[] args) {
        int[] firstSequence = {1, 1, 2, 3, 4, 4, 6, 10, 10, 78, 100, 100, 101, 102, 103, 103, 103};
        int[] secondSequence = {0, 3, 3, 4, 6, 6, 7, 8, 10, 53, 66, 70, 92, 105, 125, 125, 1001};
        firstSequence = Arrays.copyOf(firstSequence, firstSequence.length + secondSequence.length);
        System.arraycopy(secondSequence, 0, firstSequence, firstSequence.length - secondSequence.length, secondSequence.length);
        Arrays.sort(firstSequence);
        System.out.println(Arrays.toString(firstSequence));
    }
}
