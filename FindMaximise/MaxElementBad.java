import java.util.Arrays;

public class MaxElementBad {
    public static int findMax(int[] arr) {
        Arrays.sort(arr);  // O(n log n)
        return arr[arr.length - 1];  // O(1)
    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 2, 8, 6};
        System.out.println("Max element (bad): " + findMax(nums));
    }
}
