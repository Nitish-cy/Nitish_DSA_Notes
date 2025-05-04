//brute force - o(n) and space o(n)
// public class ReverseArray {
//     public static int[] revrseArray(int arr[]) {
//        int newArr[]=new int[arr.length];
//        int j=0;
//        for (int i =arr.length-1;i>=0;i--) {
//            newArr[j++]=arr[i];
//        }
//        return newArr;
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 4, 4, 5};
//         int reversedArr[]=revrseArray(arr); 
//         for (int num : reversedArr) {
//             System.out.print(num+" ,");
//         }
//     }
// }
//optimised
public class ReverseArray {
    public static int[] revrseArray(int arr[]) {
       int first=0;
       int last=arr.length-1;
       while(first<last) {
           int swp=arr[first];
           arr[first]=arr[last];
           arr[last]=swp;
           first ++;
           last--;
       }
       return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 4, 5};
        int reversedArr[]=revrseArray(arr); 
        for (int num : reversedArr) {
            System.out.print(num+" ,");
        }
    }
}