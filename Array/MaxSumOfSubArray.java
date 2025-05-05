public class MaxSumOfSubArray{
    public static void pairsArr(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
          
            for (int j=i;j<arr.length;j++) {
                  int sum=0;
                for (int k=i;k<=j;k++) {
                     sum=sum+arr[k];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
             
            }
           
        }
           System.out.println(maxSum);
    }
public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    pairsArr(arr);
}
}