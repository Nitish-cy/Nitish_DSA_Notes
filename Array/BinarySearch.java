public class BinarySearch {
    public static boolean binarySearch(int arr[], int start, int end, int num) {
        while (start <= end) {
            int mid = start + (end - start) / 2; // avoids overflow
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4, 5};
        int num = 6;
        System.out.println(binarySearch(arr, 0, arr.length - 1, num)); // Output: false
    }
}
