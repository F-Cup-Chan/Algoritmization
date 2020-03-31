public class FourthPart_9 {
    public static void main(String[] args) { //работает только для выпуклых четырехугольников, для невыпуклых в некоторых случаях решение невозможно
        int x = 10;
        int y = 9;
        int z = 13;
        int t = 18;
        double hypotenuse;
        double square;
        hypotenuse = Math.sqrt(x * x + y * y);
        square = triangleSquare(x, y, hypotenuse) + triangleSquare(z, t, hypotenuse);
        System.out.println("площадь четрыехугольника равна " + square);
    }

    private static double triangleSquare (int a, int b, double c){ //метод считает площадь треугольника по трем сторонам используя формулу Герона
        double square;
        double semiPerimeter = (a + b + c) / 2;
        square = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        return square;
    }
}
