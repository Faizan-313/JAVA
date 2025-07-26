public class ArrayManager implements ArrayOperations {
    private int[] arr;

    public ArrayManager(int size) {
        arr = new int[size];
    }

    @Override
    public void insert(int index, int value) {
        try {
            arr[index] = value;
            System.out.println("Inserted " + value + " at index " + index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index " + index + ". Array size is " + arr.length);
        }
    }

    @Override
    public int search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i; // return first index where found
            }
        }
        return -1; // not found
    }

    @Override
    public void display() {
        System.out.print("Array contents: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
