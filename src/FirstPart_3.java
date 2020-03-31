public class FirstPart_3 {
    public static void main(String[] args){
        int[] array = new int[]{12, 0, -543, 65, -6, 0, 6, 0, -4, 8, -65};
        int more = 0;
        int less = 0;
        int equal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) more++;
            else if (array[i] < 0) less++;
            else equal++;
        }
        System.out.println("Больше " + more + " Меньше " + less + " Равно " + equal);
    }
}
