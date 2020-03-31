public class FourthPart_1 {

    public static void main(String[] args) {
        double num1 = -7.5;
        double num2 = 35.9;
        double gcd = FourthPart_1.gcd(num1, num2);
        double lcd = FourthPart_1.lcd(num1, num2, gcd);
        System.out.println("НОК = " + lcd + "   НОД = " + gcd);
    }

    private static double gcd(double a, double b){

        while (b != 0){
            double tmp = a%b;
            a = b;
            b = tmp;
        }

        return Math.abs(a);
    }

    private static double lcd(double a, double b, double lcd){
        double gcd = Math.abs((a * b / lcd));
        return gcd;
    }
}
