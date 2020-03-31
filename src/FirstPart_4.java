public class FirstPart_4 {
    public static void main(String[] args) {
        int[] array = {7, 17, 77, -88, 37, -1, -79};
        int maxNumber = 0;
        int max = 0;
        int minNumber = 0;
        int min = 0;
        int buffer;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                maxNumber = i;
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                minNumber = i;
                min = array[i];
            }
        }
        buffer = array[maxNumber];
        array[maxNumber] = array[minNumber];
        array[minNumber] = buffer;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
