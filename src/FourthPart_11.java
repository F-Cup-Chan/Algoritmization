import java.util.Arrays;

public class FourthPart_11 {
    public static void main(String[] args) {
        int firstNum = 21243004;
        int secondNum = 1231123;

        if (amountOfNumbers(firstNum) > amountOfNumbers(secondNum)){
            System.out.println("В первом числе цифр больше");
        } else if (amountOfNumbers(firstNum) < amountOfNumbers(secondNum)){
            System.out.println("Во втором числе цифр больше");
        } else {
            System.out.println("Количество цифр равно");
        }

    }

    private static int amountOfNumbers (int num){
        int key = (int)Math.log10(num)+1;
        return key;
    }
}
