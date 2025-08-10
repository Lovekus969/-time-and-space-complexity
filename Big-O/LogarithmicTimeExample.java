public class LogarithmicTimeExample {

    // Binary Search: Search for target in a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0;                                            // left pointer 
        int right = arr.length - 1;                            // just like the right  pointer

        while (left <= right) {
            int mid = left + (right - left) / 2;                // perfect intution 

            if (arr[mid] == target) {
                return mid; // Found target
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] sortedArr = {2, 4, 6, 8, 10, 12, 14, 16};

        int target = 10;
        int index = binarySearch(sortedArr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }
}
