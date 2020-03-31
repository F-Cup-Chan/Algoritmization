public class FourthPart_2 {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = -1000000000;
        int num3 = 20;
        int num4 = -60;
        num2 = FourthPart_2.gcd(num1, num2);
        num3 = FourthPart_2.gcd(num2, num3);
        num4 = FourthPart_2.gcd(num3, num4);
        System.out.println(num4);
    }

    private static int gcd(int a, int b){

        while (b != 0){
            int tmp = a%b;
            a = b;
            b = tmp;
        }

        return Math.abs(a);
    }
}
