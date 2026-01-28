public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];   // element to be inserted
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place key at correct position
            arr[j + 1] = key;
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
