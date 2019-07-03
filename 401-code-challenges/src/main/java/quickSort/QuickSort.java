package quickSort;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 4, 2143, 234, 10};
        int n = arr.length;

        QuickSort test = new QuickSort();
        test.quickSort(arr, 0, n-1);
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }

    public void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int position = partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
            }
        }

    public int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int low = left - 1 ;
        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot) ;
            low++;
            int temp = arr[low];
            arr[low] = arr[i];
            arr[i] = temp;
        }
        int temp = arr[low+1];
        arr[low+1] = arr[right];
        arr[right] = temp;

        return low + 1;
    }

//    public void swap(int[] arr, int i, int low) {
//        int temp = arr[low];
//        arr[low] = arr[i];
//        arr[i] = temp;
//    }
}

