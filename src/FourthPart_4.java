public class FourthPart_4 {

    public static void main(String[] args) {
        int[][] coord = {{1, 3, 4, 7, 9}, {4, 8, 11, 0, 99}};
        double distanceBetweenPoints = 0;
        for (int i = 0; i < coord[0].length; i++) {
            for (int j = i + 1; j < coord[1].length; j++) {
                double distanceBetweenCurrentPoints = FourthPart_4.distanceBetweenPoints(coord[0][i], coord[1][i], coord[0][j], coord[1][j]);
                if (distanceBetweenCurrentPoints > distanceBetweenPoints){
                    distanceBetweenPoints = distanceBetweenCurrentPoints;
                }
            }
        }

        System.out.println("Расстояние между двумя точками " + distanceBetweenPoints);
    }

    private static double distanceBetweenPoints(int x1, int y1, int x2, int y2){
        double distanceBetweenPoints;
        double xCoordinate = x1 - x2; //координта фектора между двумя точками по икс
        double yCoordinate = y1 - y2; //кордината вектора между точками по игрик
        distanceBetweenPoints = Math.sqrt(xCoordinate*xCoordinate + yCoordinate*yCoordinate); //длина вектора/длина между точками
        return distanceBetweenPoints;
    }
}
