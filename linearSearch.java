public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return the index where key is found
            }
        }
        return -1; // key not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        int key = 4;

        int result = linearSearch(numbers, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
