public class FirstPart_8 {
    public static void main(String[] args) {
        int[] array = {2, -5, 54, 456, -57, -98, -98, 1};
        int minValue = FirstPart_8.minValue(array);
        int z = 0; //index for second archive
        int[] secondArray = new int[array.length - FirstPart_8.numOfMin(array, minValue)];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != minValue){
                secondArray[z] = array[i];
                z++;
            }
        }
        System.out.print("New array:  ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }

    private static int minValue(int[] arr){
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) minValue = arr[i];
        }
        return minValue;
    }

    private static int numOfMin(int[] arr, int minValue){
        int numOfMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==  minValue) numOfMin++;
        }
        return numOfMin;
    }
}
