public class FirstPart_6 {
    public static void main(String[] args) {
        double[] array = {12.5, -32, 43.2, 5.7, 3.4, -12.2, 75.6, 6.9, 78, 0, 0, 8.0, 8, -8}; // массив с числами
        int[] numSimpleNumbersArray = new int[FirstPart_6.amountOfSimpleValues(array.length)]; // массив для хранения "простых" порядковых номеров с длиной равной поличеству прочтых порядковыхъ номеров
        int numForSecondArray = 0; //переменная для индексирования массива numSimpleSecondArray
        double sum = 0;
        for (int i = 1; i < array.length; i++) { //перебор всех ИНДЕКСОВ массива с числами, цикл вносит в массив для хранения простых порядковых номеров ИНДЕКСЫ массива с числами которые соответствуют простым ПОРЯДКОВЫМ НОМЕРАМ
            if (FirstPart_6.ifValueIsSimple(i+1)){ // i+1 потому что ПОРЯДКОВЫЙ НОМЕР больше на единицу чем ИНДЕКС
                numSimpleNumbersArray[numForSecondArray] = i;
                numForSecondArray++;
            }
        }
        for (int i = 0; i < numSimpleNumbersArray.length; i++) { //цикл подсчитывает сумму элементов массива с числами порядковый номер которых простое число
            sum += array[numSimpleNumbersArray[i]];
        }
        System.out.println(sum);
    }
    private static boolean ifValueIsSimple(int value) { //возвращает true если число простое и false если число.. не простое
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

    private static int amountOfSimpleValues(int lengthOfArray){ //возвращает количество простых чисел от двух до переданного в метод значения
        int amountOfSimpleVal = 0;
        for (int i = 2; i <= lengthOfArray; i++){
           if (FirstPart_6.ifValueIsSimple(i)) amountOfSimpleVal++;
        }
        return amountOfSimpleVal;
    }
}
