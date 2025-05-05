//brute force
// public class MaxSumOfSubArray{
//     public static void pairsArr(int arr[]){
//         int maxSum=Integer.MIN_VALUE;
//         for (int i=0;i<arr.length;i++) {
          
//             for (int j=i;j<arr.length;j++) {
//                   int sum=0;
//                 for (int k=i;k<=j;k++) {
//                      sum=sum+arr[k];
//                 }
//                 if(sum>maxSum){
//                     maxSum=sum;
//                 }
             
//             }
           
//         }
//            System.out.println(maxSum);
//     }
// public static void main(String[] args) {
//     int arr[]={2,4,6,8,10};
//     pairsArr(arr);
// }
// }

//optimal
//kedane's algo
public class MaxSumOfSubArray{
    public static void pairsArr(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0;i<arr.length;i++) {
                     cs=cs+arr[i];
                if(cs<0){
                    cs=0;
                }
            maxSum=Math.max(cs,maxSum);
        }
           System.out.println(maxSum);
    }
public static void main(String[] args) {
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
    pairsArr(arr);
}
}