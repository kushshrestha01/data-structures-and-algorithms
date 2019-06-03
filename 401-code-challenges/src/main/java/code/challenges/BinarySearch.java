package code.challenges;

public class BinarySearch {
    public boolean someLibraryMethod() {
        return true;
    }

    public int BinarySearch(int[] arr, int x){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                left = mid + 1;

            // If x is smaller, ignore right half
            else
                right = mid - 1;
        }
        return -1;
        }
}
