public class FirstPart_2 {
    public static void main(String[] args){
        int[] array = {12, 43, 546, 7, 6, 6, 45, 456, 24};
        int Z = 10;
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]>Z) {
                array[i] = Z;
                count++;
            }
        }
        System.out.println(count);
        Integer integer = 12 ;
        System.out.println(integer.compareTo(10));
    }
}
