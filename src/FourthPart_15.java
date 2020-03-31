public class FourthPart_15 {
    public static void main(String[] args) {
        int n = 5;
        int lowerLimit = (int)Math.pow(10, n - 1);
        int upperLimit = (int)Math.pow(10, n) - 1;
        int[] numbersArray = new int[upperLimit - lowerLimit];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = lowerLimit;
            lowerLimit++;
        }

        for (int i = 0; i < numbersArray.length; i++) {
            int[] arrayWithNumbers = convertNumberToArray(numbersArray[i], n);
            if (checkNumber(arrayWithNumbers)){
                System.out.println("Цифры числа " + numbersArray[i] + " образуют строго возрастающую последовательность");
            }
        }
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

    private static boolean checkNumber (int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i+1] - 1){
                return false;
            }
        }

        return true;
    }
}
