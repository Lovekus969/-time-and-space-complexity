class Main2 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j]; // keep adding
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println("Max Subarray Sum: " + maxSum);
    }
}
