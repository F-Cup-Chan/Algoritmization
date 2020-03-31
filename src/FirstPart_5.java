public class FirstPart_5 {
    public static void main(String[] args) {
        int[] array = {8, 7, -3, 8, -21, 5, -5, 100, -100};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) System.out.println(array[i]);
        }
    }
}
