public class MergeSortedArrays {
    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;        // Last valid element index in A
        int j = n - 1;        // Last element index in B
        int idx = m + n - 1;  // Last index in A

        // Merge from end to start
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[idx--] = A[i--];
            } else {
                A[idx--] = B[j--];
            }
        }

        // If any elements left in B, copy them
        while (j >= 0) {
            A[idx--] = B[j--];
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 0, 0, 0};  // m = 4 valid elements, 3 spaces for B
        int[] B = {2, 4, 6};              // n = 3

        merge(A, 4, B, 3);

        System.out.println("Merged array: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
