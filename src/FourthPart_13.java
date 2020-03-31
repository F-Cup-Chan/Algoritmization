public class FourthPart_13 {
    public static void main(String[] args) {
        int n = 94;
        int border = findBorder(n);
        for (int i = n; i < border - 1; i++) {
            showTwins(i);
        }
    }

    private static int findBorder (int key){
        return key * 2;
    }

    private static int findTwins(int key){
        return key + 2;
    }

    private static void showTwins(int key){
        System.out.println("Числа " + key + " и " + findTwins(key) + " являются близнецами");
    }
}
