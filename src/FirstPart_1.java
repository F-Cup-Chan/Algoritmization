public class FirstPart_1 {
    public static void main(String[] args){
        int[] array = {10, 34, 4, 123, 42, 52, 345, 345, 45, 45};
        int K = 6;
        int sum = 0;

        for (int value : array) {
            if (value % K == 0) sum += value;
        }
        System.out.println(sum);

        int num = switch(K){
            case 2->K;
            default -> throw new IllegalStateException("Unexpected value: " + K);
        };
    }
}
