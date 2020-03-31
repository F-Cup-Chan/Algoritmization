public class FourthPart_17 {
    public static void main(String[] args) {

        int num = 12970;
        int counter = 0;

        while (num > 0){
            int amountOfNumbers = amountOfNumbers(num);
            int[] arrWithNum = convertNumberToArray(amountOfNumbers, num);
            num -= sumNumbers(arrWithNum);
            counter++;
        }

        System.out.println("Количество операций " + counter);
    }

    private static int[] convertNumberToArray (int key, int amountOfNumbers){
        int[] array = new int[amountOfNumbers];
        int buffer = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((key - buffer) / Math.pow(10, (amountOfNumbers - i - 1)));
            buffer += array[i] * Math.pow(10, amountOfNumbers - i - 1);
        }

        return array;
    }

    private static int amountOfNumbers (int num){
        int key = (int)Math.log10(num)+1;
        return key;
    }

    private static int sumNumbers(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
