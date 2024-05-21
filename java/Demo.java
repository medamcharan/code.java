public class Demo {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 7, 4, 9 };
        int low = 0;
        int high = arr.length - 1;
        Quicksort(arr, low, high);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void Quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = Pvbit(arr, low, high);
            Quicksort(arr, low, pi - 1);
            Quicksort(arr, pi + 1, high);
        }
    }

    public static int Pvbit(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
