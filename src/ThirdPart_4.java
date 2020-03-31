import java.util.Arrays;

public class ThirdPart_4 { //в задании имелось в виду переставить их в порядке убывания? последовательность из задания и так в порядке возрастания
    public static void main(String[] args) {
        int[] sequence = {1, 0, 20, 4, -5, 60, -7, 3, -9, 0, -12, 103, 4, -5, 1, 10, -8, 109, -110, 11, 30};
        int countOfChanges = 0;
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence.length - 1; j++) {
                if (sequence[j] < sequence[j+1]){
                    int buffer = sequence[j];
                    sequence[j] = sequence[j+1];
                    sequence[j+1] = buffer;
                    countOfChanges++;
                }
            }
        }
        System.out.println(Arrays.toString(sequence));
        System.out.println(countOfChanges);
    }
}
