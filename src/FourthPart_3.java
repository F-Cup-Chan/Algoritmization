public class FourthPart_3 {

    public static void main(String[] args) {
        double a = 3.5; //сторона шестиугольника
        double square = FourthPart_3.triangleSquare(a) * 6;
        System.out.println("Площпдь треугольника = " + square);
    }

    private static double triangleSquare(double a){
        a = (Math.sqrt(3)/4*a*a);
        return a;
    }
}
