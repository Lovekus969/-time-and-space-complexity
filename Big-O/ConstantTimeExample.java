public class ConstantTimeExample {

    // This method returns the first element of the array
    // No matter how big the array is, it always does just one operation
    public static int getFirstElement(int[] arr) {
        return arr[0]; // Accessing the first element is constant time
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};     // as position start alwasy from 0 to array.length -1 

        int first = getFirstElement(numbers);
        System.out.println("First element is: " + first);
    }
}
