public class FourthPart_16 {
    public static void main(String[] args) {

        int n = 5;
        int lowerLimit = (int)Math.pow(10, n - 1);
        int upperLimit = (int)Math.pow(10, n) - 1;
        int[] numbersArray = new int[upperLimit - lowerLimit];
        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = lowerLimit;
            lowerLimit++;
        }

        for (int i = 0; i < numbersArray.length; i++) {
            int[] arr = convertNumberToArray(numbersArray[i], n);

            if (checkNumber(arr) == n){
                sum += numbersArray[i];
            }

        }

        System.out.println("Сумма искомых чисел " + sum);
        System.out.println("Количество четных чисел в сумме " + (amountOfNumbers(sum) - checkNumber(convertNumberToArray(sum, amountOfNumbers(sum)))));

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

    private static int checkNumber (int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0){
                sum++;
            }
        }
        return sum;
    }

    private static int amountOfNumbers (int num){
        int key = (int)Math.log10(num)+1;
        return key;
    }
}
