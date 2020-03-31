import java.util.Arrays;

public class ThirdPart_5 { //не работает. пофиксить
    public static void main(String[] args) {
        int[] sequence = {1, -3, 20, 4, -5, 60, -7, 3, -9, 1, -12, 103, 4, -5, 1, 10, -8, 109, -110, 11};
        //Arrays.sort(sequence);

        for (int i = 0; i < sequence.length; i++) {
            System.out.println("start for " + i);
            System.out.println(Arrays.toString(sequence));
            int buffer = sequence[i];
            int binarySearchResult;
            int k = 0;

            do {
                binarySearchResult = Arrays.binarySearch(sequence, 0, i, sequence[i] + k);
                System.out.println("k: " + k);
                k++;
                if (k > sequence.length) break;
            } while (binarySearchResult < i);

            if (binarySearchResult < 0){

                if (sequence[i] > sequence[0]){
                    binarySearchResult = i;
                    System.out.println("fail+");
                } else {
                    binarySearchResult = 0;
                    System.out.println("fail-");
                }

            }

            System.out.println("Значение ай " + i);
            System.out.println("Искомое значение " + sequence[i]);
            System.out.println("и ебаного бинари сёрч " + binarySearchResult);
            System.arraycopy(sequence, binarySearchResult, sequence, binarySearchResult + 1,  i - binarySearchResult);
            sequence[binarySearchResult] = buffer;
            System.out.println("end for " + i);
        }

        System.out.println(Arrays.toString(sequence));

    }

}
