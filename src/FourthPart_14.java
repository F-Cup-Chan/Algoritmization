public class FourthPart_14 {
    public static void main(String[] args) {
        int k = 10000000;
        for (int i = 1; i <= k; i++) {
            int amountOfNumbers = amountOfNumbers(i);
            int[] arrayWithNumbers = convertToArray(i);
            int calculatedNum = calculateNum(arrayWithNumbers, amountOfNumbers);
            if (isArmstrongNum(calculatedNum, i)){
                System.out.println("Число " + i + " является числом Армстронга");
            }
        }
    }

    private static int[] convertToArray (int key){
        int[] array = new int[amountOfNumbers(key)];
        int buffer = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)((key - buffer) / Math.pow(10, (amountOfNumbers(key) - i - 1)));
            buffer += array[i] * Math.pow(10, amountOfNumbers(key) - i - 1);
        }

        return array;
    }

    private static boolean isArmstrongNum(int calculatedNum, int number){

        if (number == calculatedNum){
            return true;
        } else {
            return false;
        }

    }

    private static int amountOfNumbers (int num){
        int key = (int)Math.log10(num)+1;
        return key;
    }

    private static int calculateNum (int[] arr, int amountOfNumbers){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += Math.pow(arr[i], amountOfNumbers);
        }

        return sum;
    }

}
