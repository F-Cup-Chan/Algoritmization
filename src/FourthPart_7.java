public class FourthPart_7 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i < 10; i += 2) {
            sum += findFactorial(i);
        }

        System.out.println(sum);
    }

    private static int findFactorial(int value){
        int factorial = 0;

        for (int i = 0; i <= value; i++) {
            factorial += i;
        }

        return factorial;
    }
}
