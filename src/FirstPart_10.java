import java.util.Arrays;

public class FirstPart_10 {
    public static void main(String[] args) {
        int[] numbers = {21, 23, 56, 456, 9, 56, 2, 7, 45, 23, 57, 121, 6};
        int variableIndex = 1;
        int modifyingIndex = 2;
        while (modifyingIndex < numbers.length){
            numbers[variableIndex] = numbers[modifyingIndex];
            variableIndex++;
            modifyingIndex += 2;
        }
        if (numbers.length % 2 == 0){ //if length of array is even
            for (int i = numbers.length / 2; i < numbers.length; i++){
                numbers[i] = 0;
            }
        } else {
            for (int i = numbers.length / 2 + 1; i < numbers.length; i++) { //if length of array is odd
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
