public class FourthPart_6 {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;
        int thirdNumber = 15;

        if (gcd(firstNumber, secondNumber) == 1 && gcd(firstNumber, thirdNumber) == 1){
            System.out.println("Числа взаимно простные");
        } else{
            System.out.println("Числа не взаимно простные");
        }
    }

    private static double gcd(int a, int b){ //наибольший общий делитель

        while (b != 0){
            int buf = a%b;
            a = b;
            b = buf;
        }

        return Math.abs(a);
    }
}
