import java.util.Arrays;

public class ThirdPart_8 {
    public static void main(String[] args) {
        int[] numerators = {1, 3, 5, 7, 9}; //числители
        int[] denominators = {2, 4, 7, 8, 11}; //знаменатели
        double[] nums = new double[numerators.length];
        double commonDenominator = denominators[0];
        for (int i = 0; i < denominators.length; i++) {
            commonDenominator = findLCM(commonDenominator, denominators[i]);
        }
        for (int i = 0; i < numerators.length; i++) {
            numerators[i] *= (commonDenominator/denominators[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numerators[i] / commonDenominator;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static double findLCM(double number1, double number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }

        double absHigherNumber = Math.max(number1, number2);
        double absLowerNumber = Math.min(number1, number2);
        double lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }
        return lcm;
    }

}
