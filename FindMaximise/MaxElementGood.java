public class MaxElementGood {
    public static int findMax(int[] arr) {
        int max = arr[0];  // O(1)
        for (int i = 1; i < arr.length; i++) {  // O(n)
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;  // O(1)
    }

    public static void main(String[] args) {
        int[] nums = {4, 10, 2, 8, 6};
        System.out.println("Max element (good): " + findMax(nums));
    }
}
