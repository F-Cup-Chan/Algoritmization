public class SecondPart_16 {
    public static void main(String[] args) {
        int[][] magicSquare = new int[3][3];
        magicSquare[0][0] = 4;
        magicSquare[0][1] = 9;
        magicSquare[0][2] = 2;
        magicSquare[1][0] = 3;
        magicSquare[1][1] = 5;
        magicSquare[1][2] = 7;
        magicSquare[2][0] = 8;
        magicSquare[2][1] = 1;
        magicSquare[2][2] = 6;
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[i].length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}
