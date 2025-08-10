class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {  // start index
            for (int j = i; j < n; j++) {  // end index
                int sum = 0;
                for (int k = i; k <= j; k++) {  // sum subarray
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println("Max Subarray Sum: " + maxSum);
    }
}
