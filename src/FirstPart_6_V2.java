public class FirstPart_6_V2 { //оптимизированная версия шестого задания
    public static void main(String[] args) {
        double[] array = {12.5, -32, 43.2, 5.7, 3.4, -12.2, 75.6, 6.9, 78, 0, 0, 8.0, 8, -8};
        double sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (ifValueIsSimple(i+1)) {
                sum += array[i];
            }
        }
        System.out.print(sum);
    }
    static boolean ifValueIsSimple(int value) { //возвращает true если число простое и false если число.. не простое
        int amountOfDividers = 0;
        for (int i = 2; i < value; i++){
            if (value % i == 0) {
                amountOfDividers++;
            }
        }
        if (amountOfDividers == 0) {
            return true;
        }
        else return false;
    }
}
