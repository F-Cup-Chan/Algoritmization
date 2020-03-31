import java.util.Arrays;

public class FourthPart_12 {
    public static void main(String[] args) {
        int k = 30;
        int n = 10000000;
        int lengthOfArray = (int)(Math.random() * 6) + 1;
        double[] a = new double[lengthOfArray];

        for (int i = 0; i < a.length; i++) {
            //System.out.println((int)Math.log10(n)+1);
            a[i] = createNum(k, n);

            if (a[i] > n) {
                a[i] = a[i] / 10;
            }

        }

        System.out.println(Arrays.toString(a));
    }

    private static int createNum (int a, int b){
        int num = 0;
        int key = (int)Math.log10(b)+1; //максимальное количество цифр в числе
        int[] arr = new int[key]; //массив с цифрами, входящими в состам числа
        int buffer = 0;

        for (int i = 0; i < key - 1; i++) { //создает все цифры числа кроме последнего

            if (a - buffer > 9){
                arr[i] = (int)(Math.random() * 9 + 0);
            } else {
                arr[i] = (int)(Math.random() * (a - buffer) + 0);
            }

            buffer += arr[i];
        }

        arr[key-1] += a - buffer; //создает последнее число

        for (int i = 0; i < arr.length; i++) { //из массива с цифрами делает число
            num += arr[i] * Math.pow(10, i);
        }

        return num;
    }
}
