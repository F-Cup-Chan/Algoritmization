public class FirstPart_9 {
    public static void main(String[] args) {
        int[] numbers = {120, 120, 120, 9, 8, 7, 68, 56, 8, 7, 6, 6, 8, 7, 6, 78, 80};
        int amountOfSameNumbers = 0;
        int mostCommonNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (amountOfSameNumbers < findAmountOfSameNumbers(numbers[i], numbers)){
                mostCommonNumber = numbers[i];
                amountOfSameNumbers = findAmountOfSameNumbers(numbers[i], numbers);
            } else if (amountOfSameNumbers == findAmountOfSameNumbers(numbers[i], numbers)){
                mostCommonNumber = Math.min(numbers[i], mostCommonNumber);
            }
        }
        System.out.println(mostCommonNumber);
    }
    private static int findAmountOfSameNumbers(int value, int[] array){
        int amountOfSameNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                amountOfSameNumbers++;
            }
        }
        return amountOfSameNumbers;
    }
}
