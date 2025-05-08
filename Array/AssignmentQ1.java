
import java.util.HashSet;

// Question 1:Given an integer array nums, return true if any value appears at least twice in
//  the array, and return false if every element is distinct.
//TC- O(n2)
// public class AssignmentQ1 {

//     public static boolean countAppearence(int arr[]) {
//         int count = 1;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; j < arr.length; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                     if (count >= 2) {
//                         return true;
//                     }
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         //int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
//         int arr[] = {1, 2, 3, 4,1};
//         System.out.println(countAppearence(arr));
//     }
// }
//optimal - O(n)
public class AssignmentQ1 {

    public static boolean countAppearence(int arr[]) {
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            }else{
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //int arr[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int arr[] = {1, 2, 3, 4};
        System.out.println(countAppearence(arr));
    }
}
