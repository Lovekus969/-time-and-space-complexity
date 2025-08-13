public class RecursionExample {

    // Recursive function
    static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 5; // Example input
        int result = factorial(num); // Calling the recursive function
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
