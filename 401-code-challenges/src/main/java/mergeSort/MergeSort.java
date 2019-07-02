package mergeSort;

public class MergeSort {

    public int[] mergeSort(int[] arr) {
        if(arr.length == 0) {
            throw new NullPointerException();
        }
        int n = arr.length;
        if(arr.length > 1) {
            int mid = n/2;
            int[] b = new int[mid];
            int[] c = new int[n - mid];

            for(int i = 0; i < b.length; i++){
                b[i] = arr[i];
            }

            for(int i = mid; i < arr.length; i++) {
                c[i - mid] = arr[i];
            }

            mergeSort(b);
            mergeSort(c);
            merge(b, c, arr);
        }
        return arr;
    }

    private int[] merge(int[] b, int[] c, int[] a) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < b.length && j < c.length) {
            if(b[i] <= c[j]) {
                a[k] = b[i];
                i = i + 1;
            } else {
                a[k] = c[j];
                j = j + 1;
            }
            k = k + 1;
        }
        while (i < b.length) {
            a[k++] = b[i++];
        }
        while (j < c.length) {
            a[k++] = c[j++];
        }
        return a;
    }
}
