import java.util.*;

public class ShuffleArray {
    public static void shuffleArray(int[] arr) {
        Random rand = new Random();
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Swap elements at positions i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        shuffleArray(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}