import java.util.*;

public class MaxAreaInHistogram {

    public static void maxArea(int arr[]) {
        int maxAre = 0;
        int nsr[] = new int[arr.length];  // next smaller right
        int nsl[] = new int[arr.length];  // next smaller left

        // Step 1 - Calculate next smaller right (nsr)
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;  // If no smaller element on the right, set nsr[i] to arr.length
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Step 2 - Calculate next smaller left (nsl)
        s = new Stack<>(); // Empty the stack
        for (int i = 0; i < arr.length; i++) {  // Fix the loop to iterate up to arr.length - 1
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;  // If no smaller element on the left, set nsl[i] to -1
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Step 3 - Calculate the area for each bar and find the maximum area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;  // Calculate the width (nsr[i] - nsl[i] - 1)
            int currArea = height * width;
            maxAre = Math.max(currArea, maxAre);  // Update max area if the current area is larger
        }

        System.out.println("Max area is -: " + maxAre);
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};  // Heights in the histogram
        maxArea(arr);
    }
}
